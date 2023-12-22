import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); 
        }
        int maxv = -2000000000;
        int minv = a[0];

        for (int i = 1; i < a.length; i++) {
            maxv = Math.max(maxv, a[i]-minv);
            minv = Math.min(minv, a[i]);
        }

        System.out.println(maxv);

    }
}
