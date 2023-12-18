import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = cin.nextInt();
        }

        int work = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                work = work ^ (a[i] + b[j]);
            }
        }
        System.out.println(work);
    }
}