
import java.lang.*;
import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);
        
    public static void main(String args[])
    {
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n==0 && m==0) break;
            
            int[] t = new int[n+1];
            int tn = 0;
            for(int i=0; i<n; i++){
                t[i] = sc.nextInt();
                tn += t[i];
            }
            int[] h = new int[m+1];
            int hn = 0;
            for(int i=0; i<m; i++){
                h[i] = sc.nextInt();
                hn += h[i];
            }
            int ans_t = 0;
            int ans_h = 0;
            int min = 100000;
            for(int i=0; i<n/2; i++){
                for(int j=0; j<m; j++){
                    tn = tn - t[i] + h[j];
                    hn = hn - h[j] + t[i];
                    
                    if(tn == hn && tn < min){
                        ans_t = t[i];
                        ans_h = h[j];
                        min = tn;
                    }
                    tn = tn + t[i] - h[j];
                    hn = hn + h[j] - t[i];
                }
            }
            if(min != 100000) System.out.println(ans_t + " " + ans_h);
            else System.out.println("-1");
        }
    }   
}


	    