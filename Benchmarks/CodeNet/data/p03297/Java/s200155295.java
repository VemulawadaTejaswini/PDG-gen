import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        
        for (int i = 0; i < t; i++) {
            String[] abcd = br.readLine().split(" ");
            long a = Long.parseLong(abcd[0]);
            long b = Long.parseLong(abcd[1]);
            long c = Long.parseLong(abcd[2]);
            long d = Long.parseLong(abcd[3]);
            long initial = a;
            boolean flag = true;
            Set<Long> memo = new HashSet<Long>();
            
            /*memo.add(a);
            while (a - b >= 0) {
                a -= b;
                if (a <= c) a += d;
                if (memo.contains(a)) {
                    flag = true;
                    break;
                }
                memo.add(a);
            }*/
            
            long stock = a;
            long x = 0;
            while (!memo.contains(stock)) {
                memo.add(stock);
                x = (stock-c)/b;
                if (stock < c) x = stock/b;
                if (x == 0) x = 1;
                stock -= x*b;
                if (stock < 0) {
                    flag = false;
                    break;
                }
                if (stock <= c) stock += d;
            }
            System.out.println(flag?"Yes":"No");
            flag = true;
            memo.clear();
        }
    }
}
