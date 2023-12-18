import java.io.*;
import java.util.*;

public class Main {
    static int[] dp, a;
    static int m, L;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int cnt = 0;
        for(char c:s) cnt += c=='R'?1:0;
        String ans = cnt>(n-cnt)?"Yes":"No";
        System.out.println(ans);
    }
}