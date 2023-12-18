import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean has1 = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                has1= true;
            }
        }
        if (!has1) {
            System.out.println(-1);
            return;
        }

        int count = 0;
        int tmp = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] != tmp) {
                count++;
            } else {
                tmp++;
            }
        }
        System.out.println(count);
    }
}