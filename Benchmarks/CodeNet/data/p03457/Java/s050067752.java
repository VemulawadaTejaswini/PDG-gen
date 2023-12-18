import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n+1];
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            t[i+1] = Integer.parseInt(s[0]);
            x[i+1] = Integer.parseInt(s[1]);
            y[i+1] = Integer.parseInt(s[2]);
        }
        
        int diff;
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            diff = Math.abs(x[i]-x[i-1]) + Math.abs(y[i]-y[i-1]);
            if (t[i]-t[i-1] >= diff && (t[i]-t[i-1])%2 == diff%2) continue;
            else {
                flag = false;
                break;
            }
        }
        
        System.out.println(flag?"Yes":"No");
    }
}



