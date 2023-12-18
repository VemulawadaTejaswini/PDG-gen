import java.io.*;
import java.util.*;
import java.math.*;
public class Main{

     public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String line1 = br.readLine();
        String[] strs = line1.trim().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int x = Integer.parseInt(strs[1]);
        String li = br.readLine();
        String[] st = li.trim().split("\\s+");
       int[] sum = new int[n+1];
       sum[0] = 0;
       for(int i=1;i<n+1;i++) { sum[i] = sum[i-1] + Integer.parseInt(st[i-1]); }
       int ans = n+1;
       for(int i=0;i<=n;i++){ if(sum[i]>x) { ans=i; break;} }
       
       System.out.println(ans);
       
}  

}



