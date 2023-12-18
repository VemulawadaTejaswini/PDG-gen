import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int min = Math.min(Math.min(8*q, 4*h), Math.min(2*s, d));
        if((n & 1) == 0){
            System.out.println((n / 2) * min);
            return;
    }
        long ans = (n / 2) *1L* min;
        ans += Math.min(4*q, Math.min(2*h, s));
        System.out.println(ans);
    }
}
