import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        long c;
        long bonus;
        Pair (long c, long bonus) {
            this.c = c;
            this.bonus= bonus;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        long d = sc.nextLong();
        long ans = Long.MAX_VALUE;
        long g = sc.nextLong();
        Pair[] arr = new Pair[(int)d];
        for (int i=0; i<d; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            arr[i] = new Pair(a, b);
            long val = (100*(i+1) * a);
            if (val == g) ans = Math.min(ans, a);
            else if (val > g) {
                long total = 0l;
                long count = 0l;
                for (int j=0; j<a; j++) {
                    total += (100*(i+1));
                    count++;
                    if (total >= g) {
                        break;
                    }
                }
                ans = Math.min(ans, count);
            } else if (val+b>=g) {
                ans = Math.min(ans, a);
            }
        }
        long sum = 0l;
        //System.out.println(ans);
        long lol = ans;
        ans = 0l;
        for (long i=d-1; i>=0; i--) {
            Pair p = arr[(int)i];
            long count = p.c;
            long bonus = p.bonus;
            sum += (count*(100*(i+1)));
            //System.out.println("sum="+sum);
            if (sum == g) {
                ans = Math.min(ans, count);
                break;
            }
            else if (sum > g) {
                long total = 0;
                long cc = 0;
                for (int j=0; j<count; j++) {
                    total = (100*(i+1));
                    //System.out.println("count="+count);
                    //System.out.println("tital="+total);
                    sum -= total;
                    cc++;
                    //System.out.println("g-"+g);
                    if (sum <= g) {
                        cc--;
                        break;
                    }
                }
                //System.out.println("cc="+cc);
                ans+=count-cc-1;
                break;
            } else if (sum+bonus >= g) {
                ans += count;
                break;
            } else {
                //System.out.println("yo");
                sum += bonus;
                ans += count;
            }
        }
        System.out.println(Math.min(lol, ans));
     }
}