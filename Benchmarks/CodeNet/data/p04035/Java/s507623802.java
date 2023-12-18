import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int ch1 = 0;
        int ch2 = N - 1;
        int total = 0;
        boolean ans = false;
        int a[] = new int[N];
        int an[] = new int[N - 1];
        for (int i = 0; N > i; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }
        for (int j = 0; N - 1 > j; j++) {
            if (a[ch1] < a[ch2]) {
                an[j] = ch1 + 1;
                if (total < L) {
                    break;
                }
                total = total - a[ch1];
                ch1++;
            } else if (a[ch1] > a[ch2]) {
                an[j] = ch2;
                if (total < L) {
                    break;
                }
                total = total - a[ch2];
                ch2--;
            }
            if (ch1 == ch2) {
                ans = true;
                break;
            }
        }
        if (ans == false) {
            System.out.println("Impossible");
        } else {
            System.out.println("Possible");
            for (int k = 0; N - 1 > k; k++) {
                System.out.println(an[k]);
            }
        }
    }

}
