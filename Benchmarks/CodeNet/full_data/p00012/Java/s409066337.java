import java.util.*;

public class Main {
    
    boolean fun(double[] s){
        double x1=s[0],y1=s[1],x2=s[2],y2=s[3],x3=s[4],y3=s[5],xp=s[6],yp=s[7],v,w;
        v=((x1-xp)*(y1-y3)-(x1-x3)*(y1-yp)) / ((x1-x2)*(y1-y3)-(x1-x3)*(y1-y2));
        w=((x1-xp)*(y1-y2)-(x1-x2)*(y1-yp)) / (-(x1-x2)*(y1-y3)+(x1-x3)*(y1-y2));
        if(0<v && v<1 && 0<w && w<1 && v+w<1)return true;
        return false;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double[] lst=new double[8];String s;
        while(sc.hasNext()){
            for(int i=0;i<8;i++){lst[i]=sc.nextDouble();}
            System.out.println(s = new Main().fun(lst) ? "YES" : "NO" );
        }
    }
}
