
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.nextInt()+sc.nextInt()>=sc.nextInt()?"Yes":"No");
//        Location[] points=new Location[5];
//        for(int i=0;i<5;i++){
//            points[i]=new Location(random(0,100),random(0,100));
//        }
//        Comp c=new Comp();
//        Arrays.sort(points,c);
//        for(int i=0;i<5;i++){
//            points[i].show();
//        }
        
    }
    static int random(int rangemin,int rangemax){
        if(rangemin>=rangemax){
            return 0;
        }else{
            return (int)(rangemin+Math.random()*(rangemax-rangemin));
        }
    }
}
class Comp implements Comparator{
    @Override
    public int compare(Object a1,Object a2){
        Location b1=(Location)a1;
        Location b2=(Location)b1;
        return b1.direction()>b2.direction()?1:-1;
    }
}
class Location{
    int x;
    int y;
    public Location(int x,int y){
        this.x=x;
        this.y=y;
    }
    double direction(){
        return Math.sqrt(x*x+y*y);
    }
    void show(){
        System.out.println("("+x+","+y+")"+this.direction());
    }
}
