import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
          int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

       int transfer = Math.min(a-b, c);
       c -= transfer;
       out.println(c);

        out.close(); System.exit(0);
    }
}
