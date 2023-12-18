import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[A];
        int b[] = new int[B];
        int c[][] = new int[M][3];
        for (int i = 0; i < A; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < B; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            c[i][0] = sc.nextInt();
            c[i][1] = sc.nextInt();
            c[i][2] = sc.nextInt();
        }
        sc.close();

        int min = a[c[0][0] - 1] + b[c[0][1] - 1] - c[0][2];
        for (int i = 1; i < M; i++) {
            if (min > (a[c[i][0] - 1] + b[c[i][1] - 1] - c[i][2])) {
                min = a[c[i][0] - 1] + b[c[i][1] - 1] - c[i][2];
            }
        }
        System.out.print(min);
    }
}