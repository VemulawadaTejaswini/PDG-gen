import java.util.*;
import java.lang.*;


class Pair<E,F>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }
}
class Point extends Pair<Double,Double>{
    public Point(double x, double y){
        super(x,y);
    }
    public double distanceTo(Point another){
        double distX = Math.abs(this.getFirst()-another.getFirst());
        double distY = Math.abs(this.getSecond()-another.getSecond());
        return Math.sqrt(distX*distX+distY*distY);/*euclidean dist*/
    }
}


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] p = new Point[N];
        for(int n=0; n<N; n++) p[n] = new Point(sc.nextInt(), sc.nextInt());

        double ans = 10000;

        for(int i=0; i<N; i++) for(int j=i+1; j<N; j++) for(int k=j+1; k<N; k++){
            double a = p[i].first, b = p[i].second;
            double c = p[j].first, d = p[j].second;
            double e = p[k].first, f = p[k].second;
            Point circum;


            double S = Math.abs(((a-e)*(d-f)-(c-e)*(b-f))/2);
            if(S<1e-9) circum = new Point((Math.max(Math.max(a,c), e)+Math.min(Math.min(a,c), e))/2,
                                          (Math.max(Math.max(b,d), f)+Math.min(Math.min(b,d), f))/2);
            else{
                double x = p[j].distanceTo(p[k]);
                double y = p[k].distanceTo(p[i]);
                double z = p[i].distanceTo(p[j]);
                circum = new Point( (x*x*(y*y+z*z-x*x)*a + y*y*(z*z+x*x-y*y)*c + z*z*(x*x+y*y-z*z)*e)/(16*S*S),
                                    (x*x*(y*y+z*z-x*x)*b + y*y*(z*z+x*x-y*y)*d + z*z*(x*x+y*y-z*z)*f)/(16*S*S));
            }
            double radius = 0;
            for(int l=0; l<N; l++){
                radius = Math.max(radius, circum.distanceTo(p[l]));
            }
            ans = Math.min(ans, radius);
        }
        if(N==2) ans = p[0].distanceTo(p[1]) * 0.5;
        System.out.println(ans);
    }


}
