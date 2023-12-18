
import java.util.*;

public class Main{

     public static void main(String []args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
       
       int ans = 0;
       if(w/2==x && h/2==y) ans = 1;
       double area = w*h;
       area/=2;
       System.out.printf("%.9f", area);
       System.out.print(" "+ans);
}  

}