import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        int n = Integer.parseInt(br.readLine().trim());
        int a[] = new int[3];
        int ans[] = new int[n+1];
        a[0]=a[1]=a[2]=1;
        
        
        int i=1,j=1,k=1;
        L1:
        for(i=1;i<=n;i++){
            if(val(i,j,k)>n) continue;
            L2:
            for(j=1;j<=n;j++){
                if(val(i,j,k)>n) {j=1;continue L1;}
                L3:
                for(k=1;k<=n;k++){
                    long f = val(i,j,k);
//                    out.println("f: "+f+' '+i+" "+j+" "+k);
                    if(f > n) {k=1;continue L2;}
                    ans[(int)f]++;
                }
            }
        }
        for(i=1;i<=n;i++) out.println(ans[i]);
        br.close();out.flush();out.close();
    }
    public static long val(long x, long y, long z){
        long ans = x*x;
        ans += y*y;
        ans += z*z;
        ans += x*y;
        ans += y*z;
        ans += z*x;
        return ans;
    }
}