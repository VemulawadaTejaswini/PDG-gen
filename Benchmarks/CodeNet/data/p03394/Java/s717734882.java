import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n == 3) {
          out.println("2 5 63");
        }
        else if(n == 4) {
          out.println("2 5 20 63");
        }
        else {
          StringBuilder sb = new StringBuilder();
          sb.append("2 2 2 3 3 ");
          for(int i=0; i<n-5; i++) sb.append("6 ");
          out.println(sb.toString());
        }
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n];
        // for(int i=0; i<n; i++) a[i] =  Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }


}
