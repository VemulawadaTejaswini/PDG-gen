import java.util.*;
 
public class Main{
 
    
 
        
    
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ms = new long[n+1];
        long[] hs = new long[n];
 
        for(int i=0;i<n+1;i++){
            ms[i] = sc.nextLong();
        }
        
        for(int i=0;i<n;i++){
            hs[i] = sc.nextLong();
        }
 
        long tot = 0;
        long min;
 
        for(int i = n;i>=0;i--){
            
            if(i<=n-1){
                min = Math.min(ms[i],hs[i]);
                ms[i] -= min;
                hs[i] -= min;
                tot += min;
            }
            
 
            if(i > 0){
                min = Math.min(ms[i],hs[i-1]);
                ms[i] -= min;
                hs[i-1] -= min;
                tot += min;
            }
            
        }
 
      
        System.out.println(tot);
 
 
 
        sc.close();
    }
}