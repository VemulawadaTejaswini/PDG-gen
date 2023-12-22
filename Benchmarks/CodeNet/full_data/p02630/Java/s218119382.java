import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] count = new int[100001];
        long sum = 0;
        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(sc.next());
            sum += a;
            count[a]++;
        }
        int q = Integer.parseInt(sc.next());
        int[] b = new int[q];
        int[] c = new int[q];
        for(int i=0; i<q; i++) {
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            sum -= b[i] * count[b[i]];
            sum += c[i] * count[b[i]];
            count[c[i]] += count[b[i]];
            count[b[i]] = 0;
            System.out.println(sum);
        }
        
    }
}
