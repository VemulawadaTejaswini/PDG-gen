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
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            Arrays.sort(a);
            int min = a[0];
            int max = a[n - 1];
                int b = sc.nextInt();
            int c = sc.nextInt();
            if (b < min || max < b) {
                System.out.println(sum(a));
                continue;
            }
            for (int j = 0; j < n; j++) {
                if(a[j] == b) {
                    a[j] = c;
                }
            }
            System.out.println(sum(a));
            continue;
        }

    }

    public static int sum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

}