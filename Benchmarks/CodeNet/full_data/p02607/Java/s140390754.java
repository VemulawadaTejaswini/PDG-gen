import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 != 0 && a[i] % 2 != 0) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }

}
