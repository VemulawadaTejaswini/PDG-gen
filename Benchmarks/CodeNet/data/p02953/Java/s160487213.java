import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        a[0] -= 1;
        for(int i=1; i<n; i++) {
          if(a[i]-1 >= a[i-1]) a[i]-=1;
          if(a[i] < a[i-1]) {
            out.println("No");
            out.close(); System.exit(0);
          }
        }
        // int n = Integer.parseInt(st.nextToken());
        out.println("Yes");
        out.close(); System.exit(0);
    }
}
