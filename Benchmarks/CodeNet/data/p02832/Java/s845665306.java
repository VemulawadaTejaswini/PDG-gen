import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int count = 0;
        int k = 1;
        for (int i = 0; i < N; i++) {
            if (a[i] == k) {
                k++;
            } else {
                count++;
            }
        }

        if (count == N) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
