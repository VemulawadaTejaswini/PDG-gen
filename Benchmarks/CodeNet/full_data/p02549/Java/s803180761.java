import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static final int NUMBER = 998244353;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<k; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            for(int j=l; j<=r; j++) {
                set.add(j);
            }
        }
        long[] table = new long[n+1];
        table[1] = 1;
        for(int i=1; i<=n; i++) {
            Iterator<Integer> it = set.iterator();
            while(it.hasNext()) {
                int next = it.next();
                if(i+next > n) {
                    break;
                }
                table[i+next] += table[i];
                table[i+next] = table[i+next] % NUMBER;
            }
        }
        System.out.println(table[n]);
    }
}
