import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        int c[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            c[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int l = 0;
        int smallA[] = new int[N];
        for (int i = 0; i < N; i++) {
            while (l < N) {
                if (b[i] > a[l]) {
                    l++;
                } else {
                    break;
                }
            }
            smallA[i] = l;
        }
        int r = 0;
        int largeC[] = new int[N];
        for (int i = 0; i < N; i++) {
            while (r < N) {
                if (b[i] >= c[r]) {
                    r++;
                } else {
                    break;
                }
            }
            largeC[i] = N - r;
        }
        long count = 0;
        for (int i = 0; i < N; i++) {
            count += smallA[i] * largeC[i];
        }
        System.out.println(count);

    }

}