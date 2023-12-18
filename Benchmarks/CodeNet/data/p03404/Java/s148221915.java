import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
       StringTokenizer st = new StringTokenizer(bf.readLine());
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       char[][] grid = new char[100][100];
       for(int i=0; i<50; i++) {
         Arrays.fill(grid[i], '.');
         Arrays.fill(grid[i+50], '#');
       }
       int cur = 0;
       for(int i=0; i<B-1; i++) {
         grid[cur/100][cur % 100] = '#';
         cur += 2;
         if(cur % 100 == 0) cur++;
         else if(cur % 100 == 1) cur--;
       }
       cur = 0;
       for(int i=0; i<A-1; i++) {
         grid[cur/100+51][cur % 100] = '.';
         cur += 2;
         if(cur % 100 == 0) cur++;
         else if(cur % 100 == 1) cur--;
       }
       out.println("100 100");
       for(int i=0; i<100; i++) {
         StringBuilder sb = new StringBuilder();
         for(int j=0; j<100; j++) sb.append(grid[i][j]);
         out.println(sb.toString());
       }
        // int[] a = new int[n];
        // for(int i=0; i<n; i++) a[i] =  Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }


}
