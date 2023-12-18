import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0 ; i < N ; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        int r = 0;
        int add = 0;
        int xor = 0;

        for (int i = 0 ; i < N ; i ++) {
            while (r < N) {
                if (add + a[r] == (xor ^ a[r])) {
                    add += a[r];
                    xor = xor ^ a[r];
                    r++;
                } else {
                    break;
                }

            }
            count = count + r - i;
            add -= a[i];
            xor -= a[i];
        }
        System.out.println(count);
    }




}