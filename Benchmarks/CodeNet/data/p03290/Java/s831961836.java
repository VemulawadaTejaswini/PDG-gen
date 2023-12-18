import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        int c;
        int bonus;
        Pair (int c, int bonus) {
            this.c = c;
            this.bonus= bonus;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int d = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        int g = sc.nextInt();
        Pair[] arr = new Pair[d];
        for (int i=0; i<d; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = new Pair(a, b);
            int val = (100*(i+1) * a);
            if (val == g) ans = Math.min(ans, a);
            else if (val > g) {
                int total = 0;
                int count = 0;
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
        int sum = 0;
        //System.out.println(ans);
        int lol = ans;
        ans = 0;
        for (int i=d-1; i>=0; i--) {
            Pair p = arr[i];
            int count = p.c;
            int bonus = p.bonus;
            sum += (count*(100*(i+1)));
            //System.out.println("sum="+sum);
            if (sum == g) {
                ans = Math.min(ans, count);
                break;
            }
            else if (sum > g) {
                int total = 0;
                int cc = 0;
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