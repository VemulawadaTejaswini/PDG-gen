import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         PrintWriter out = new PrintWriter(System.out);
         int n = Integer.parseInt(sc.next());
         int t = Integer.parseInt(sc.next());
         int ans = 0;
         int[] ta = new int[n];
         int ct = 0;
         for(int i = 0; i < n; i++)
         {
             ta[i] = Integer.parseInt(sc.next());
             if(ta[i] < ct)
             {
                 ans += (t-ct+ta[i]);
             }
             else{
                 ans += t;
             }
             ct = ta[i] + t;
         }
         out.println(ans);
         out.flush();
         sc.close();
     }
}