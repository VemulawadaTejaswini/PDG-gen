
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] a = new long[n + 1];


        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
//        for(int i = 0;i<n+1;i++){
//            System.out.print(a[i]+" ");
//            if(i == n)
//                System.out.println("");
//        }

        for (int i = n; i > 0; i--) {
            a[i] -= a[i - 1];
        }
//        for(int i = 0;i<n+1;i++){
//            System.out.print(a[i]+" ");
//            if(i == n)
//                System.out.println("");
//        }
        if (a.length > 2) {
            long temp = gcd(a[1], a[2]);
            for (int i = 2; i < n; i++) {
                gcd(a[i], a[i + 1]);
            }
            System.out.println(temp);
        } else {
            System.out.println(a[1]);
        }
    }

    static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}