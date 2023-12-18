import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        boolean check = false;
        int a[] = new int[N];
        int an[] = new int[N - 1];
        int ans = 0;
        for (int i = 0; N > i; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < N - 1; j++) {
            if (a[j] + a[j + 1] >= L) {
                ans = j;
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Impossible");
        } else {
            if (ans == 0) {
                System.out.println("Possible");
                while (N > ans) {
                    System.out.println(N);
                    N--;
                }
            } else if (ans == N - 2) {
                System.out.println("Possible");
                N = 1;
                while (N < ans + 2) {
                    System.out.println(N);
                    N++;
                }

            } else {
                System.out.println("Possible");
                for (int k = 1; k < ans + 1; k++) {
                    System.out.println(k);
                }
                for (int l = N - 1; l > ans; l--) {
                    System.out.println(l);
                }
            }
        }
    }

}