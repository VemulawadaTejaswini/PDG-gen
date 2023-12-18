import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            index[i] = a[i];
        }
        Arrays.sort(a);

        int c1 = a[n/2-1];
        int c2 = a[n/2];

        for (int i = 0; i < n; i++) {
            if (index[i] > c1) {
                System.out.println(c1);
            } else {
                System.out.println(c2);
            }
        }
    }
}
