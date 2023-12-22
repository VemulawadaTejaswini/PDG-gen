import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int[] a =new int[6];
        while(s.hasNext()){
            for(int i=0;i<6;i++){
                a[i]=s.nextInt();
            }
            double x=(-a[2]*a[4]+a[1]*a[5]) / (double)(-a[0]*a[4]+a[1]*a[3]),
                    y=(a[2]*a[3]-a[0]*a[5]) /  (double)(a[1]*a[3]-a[0]*a[4]);
        if( x == 0 || x == -0 ) x = 0;
        if( y == 0 || y == -0 ) y = 0;
            System.out.printf("%.3f %.3f\n",x,y);
        }
    }

}
