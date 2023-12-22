import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        long count = 0;
        for(int i=1; i<n; i++) {
            if(a[i]>=a[i-1]) {
                continue;
            }else {
                count += a[i-1]-a[i];
                a[i] = a[i-1];
            }
        }
        System.out.println(count);
    }
}
