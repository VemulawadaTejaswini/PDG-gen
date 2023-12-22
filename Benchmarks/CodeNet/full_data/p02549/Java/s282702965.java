import java.util.*;

public class Main {
    static final int NUMBER = 998244353;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<ABC179DTuple> tuples = new ArrayList<>(k);
        for(int i=0; i<k; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            ABC179DTuple tuple = new ABC179DTuple();
            tuple.l = l;
            tuple.r = r;
            tuples.add(tuple);
        }
        long[] table = new long[n+1];
        long[] upDown = new long[n+1];
        long up = 0;
        table[1] = 1;
        for(int i=1; i<=n; i++) {
            up += upDown[i];
            table[i] += up;
            table[i] = table[i] % NUMBER;
            for(int j=0; j<k; j++) {
                ABC179DTuple tuple = tuples.get(j);
                if(i+tuple.l <= n) {
                    upDown[i+tuple.l] += table[i];
                }
                if(i+tuple.r+1 <= n) {
                    upDown[i+tuple.r+1] -= table[i];
                }
            }
        }
        System.out.println(table[n]);
    }
}
class ABC179DTuple {
    int l;
    int r;
}
