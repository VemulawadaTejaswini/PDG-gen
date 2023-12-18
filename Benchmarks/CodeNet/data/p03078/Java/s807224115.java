import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        List<Long> values = new ArrayList<Long>(k);
        
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextLong();
        }
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextLong();
        }
        
        for (int l = 0; l < x; l++) {
            for (int m = 0; m < y; m++) {
                for (int n = 0; n < z; n++) {
                    values.add(a[l] + b[m] + c[n]);
                }
            }
        }
        
        Collections.sort(values, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.println(values.get(i));
        }
    }
}
