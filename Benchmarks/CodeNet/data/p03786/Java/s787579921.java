import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int okIdx = 0;
        long s = a[0];
        for (int i = 1; i < n; i++) {
            if(s*2 < a[i]) okIdx = i;
            s += a[i];
        }
        System.out.println(n-okIdx);
        sc.close();

    }

}
