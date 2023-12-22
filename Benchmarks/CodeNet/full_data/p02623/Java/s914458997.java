import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] nmk = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nmk[0];
        int m = nmk[1];
        int k = nmk[2];
        
        int[] abooks = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bbooks = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+=abooks[i];
        }
        
        int now = sum;
        int maxa = n;
        
        for(int a=n;a>0;a--) {
            if (now<=k) {
                break;
            }
            else {
                now-=abooks[a-1];
                maxa-=1;
            }
        }
        
        int ans = maxa;
        int maxb = 0;
        
        for(int i=maxa;i>0;i--) {
            
            
            while(true) {
                
                if (maxb==m) { break; }
                
                if (now+bbooks[maxb] <= k) {
                    now+=bbooks[maxb];
                    maxb+=1;
                        if (i+maxb>ans) { ans=i+maxb; };
                    
                }
                else {
                    break;
                }
                
            }
            
            now-=abooks[i-1];
            
        }
        
        System.out.println(ans);
        
    
    }
}
