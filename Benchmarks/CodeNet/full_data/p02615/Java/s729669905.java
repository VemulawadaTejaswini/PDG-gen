import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);

        long ars = 0;
        for (int i = a.length-1; i > 0; i--) {
            ars += a[i];
        }
        System.out.print(ars);
    }
}