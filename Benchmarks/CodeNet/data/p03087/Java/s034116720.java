import java.io.*;
import  java.util.*;
import static java.lang.System.in;

public class Main{
    static int n,m;
    static long[] head,pos;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        int n = sc.nextInt(), Q = sc.nextInt();
        String src = " "+sc.next();
        char[] s = src.toCharArray();
        int[] dp = new int[n+1];
        for(int i=2;i<=n;i++){
            if(s[i]=='C'&&s[i-1]=='A') dp[i] = dp[i-2]+1;
            else dp[i] = dp[i-1];
        }
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<Q;i++){
            int le = sc.nextInt(), ri = sc.nextInt();
            int ans = dp[ri]-dp[le-1];
            if(le>1&&s[le]=='C'&&s[le-1]=='A') ans--;
            out.println(ans);
        }
        out.flush();
    }
}
