import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9 + 7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        long[] x = new long[n];
        long[] y = new long[n];
        long[] a = new long[4];
        for(int i=0; i<n; i++){
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            for(int j=0; j<4; j++){
                long tmp = x[i]*((j%2==1)? -1 : 1) + y[i]*((j>=2)? -1 : 1);
                a[j] = Math.max(a[j], tmp);
            }
        }
        
        long ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<4; j++){
                long tmp = x[i]*((j%2==1)? -1 : 1) + y[i]*((j>=2)? -1 : 1);
                if(tmp < 0){
                    continue;
                }
                //System.out.println(x[i] + " : " + y[i] + " = " + tmp);
                //System.out.println(a[j] + " - " + tmp + " =           " + (a[j]-tmp));
                ans = Math.max(ans, a[j] - tmp);
            }
        }
        
        System.out.println(ans);
    }
    
}