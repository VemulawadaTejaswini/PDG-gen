import java.io.*;
import java.util.*;
 
/**
 * Created by Ayushi on 22 Aug 2020.
 * Problem:
 * Round:
 */
 
public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        br.close();
        int ans = n/x;
        if (n % x > 0) ans++;
      
        System.out.println(ans*t);
    }
}