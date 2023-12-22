import java.io.*;
import java.util.*;
public class Main{
    public static void main(String []args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(br.readLine());
        // long [][] dp = new long[n+1][n+1];
        // ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        double d = sc.nextDouble();
        long x;
        long y ;
        double dis;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            x = x*x;
            y = y*y;
            dis = Math.sqrt(x+y);
            if(dis <= d){
                ans++;
            }
        }
        System.out.println(ans);
    }
}