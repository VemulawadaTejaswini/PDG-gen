import java.util.*;
import static java.lang.Math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double h = scan.nextInt();
        double m = scan.nextInt();
        double ans;
        
        //角速度（分針）
        //System.out.println(Math.PI);
        //double m1 = 2*(Math.PI)/3600;
        
        //角速度（時針）
        //double h1 = 2*(Math.PI)/43200;
        
        //分針と時針が作る角度
        //角速度（時針）

        double k = Math.abs(5.5*m-30*h);
        if(k>180){
            k=k-180;
            ans= Math.sqrt(a*a+b*b-2*a*b*(Math.cos(Math.toRadians(k))));
        }else if(k<180){
            ans= Math.sqrt(a*a+b*b-2*a*b*(Math.cos(Math.toRadians(k))));
        }else{
            ans=a+b;
        }
        System.out.println(ans);
    }
}
        