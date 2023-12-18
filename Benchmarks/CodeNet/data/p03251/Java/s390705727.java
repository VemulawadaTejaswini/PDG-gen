import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int xc = sc.nextInt();
        int yc = sc.nextInt();
        boolean ans = false;
        int[] x = new int[n+1];
        int[] y = new int[m+1];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }
        x[n] = xc;
        for(int i=0; i<m; i++){
            y[i] = sc.nextInt();
        }
        y[m] = yc;
        
        int xmax = -100;
        int ymin = 100;
        
        for(int i=0; i<n+1; i++){
            if(x[i]>xmax){
                xmax = x[i];
            }
        }
        for(int i=0; i<m+1; i++){
            if(y[i]<ymin){
                ymin = y[i];
            }
        }

        if(xmax >= ymin){
            ans = true;
        }

        System.out.println(ans?"War":"No War");
    }
}