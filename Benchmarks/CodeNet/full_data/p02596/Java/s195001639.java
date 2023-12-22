import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        long num = 0;
        int t = 0, ans = -1;
        while (t++<=n){
            num = (num*10)+7;
            num %= n;
            if (num%n==0){
                ans = t;
                break;
            }
        }
        sb.append(ans);
        System.out.println(sb);
    }
}
