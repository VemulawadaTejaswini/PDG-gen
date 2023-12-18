import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());
        long d = Long.parseLong(br.readLine());
        long e = Long.parseLong(br.readLine());
        
        long[] abcde = {a, b, c, d, e};
        Arrays.sort(abcde);
        
        /*long[] num = new long[7];
        num[1] = n;
        
        int t = 0;
        while (true) {
            if (num[6] == n) break;
            
            if (num[5] > 0) {
                num[6] += Math.min(e, num[5]);
                num[5] -= Math.min(e, num[5]);
            }
            if (num[4] > 0) {
                num[5] += Math.min(d, num[4]);
                num[4] -= Math.min(d, num[4]);
            }
            if (num[3] > 0) {
                num[4] += Math.min(c, num[3]);
                num[3] -= Math.min(c, num[3]);
            }
            if (num[2] > 0) {
                num[3] += Math.min(b, num[2]);
                num[2] -= Math.min(b, num[2]);
            }
            if (num[1] > 0) {
                num[2] += Math.min(a, num[1]);
                num[1] -= Math.min(a, num[1]);
            }
            
            t++;
        }*/
        
        System.out.println((long)Math.ceil((double)n/abcde[0])+4);
    }
}



