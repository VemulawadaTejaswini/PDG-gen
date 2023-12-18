import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(c));
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            int startK = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] >= b[j]) continue;
                for (int k = startK; k < n; k++) {
                    if (b[j] >= c[k]) continue;
                    startK = k;
                    count += n - k;
                    // System.out.println(count);
                    break;
                }
            }
        }
        

        System.out.println(count);
    }
}
