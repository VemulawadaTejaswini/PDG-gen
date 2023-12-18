import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] L = new int[N];
        for (int i=0; i<N; i++) {
            L[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i=0; i<N; i++) {
            for (int k=i+1; k<N; k++) {
                for (int m=k+1; m<N; m++) {
                    if (isTriangle(L[i], L[k], L[m])) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isTriangle(int a, int b, int c) {
        if (a >= b + c) return false;
        if (b >= a + c) return false;
        if (c >= a + b) return false;
        return true;
    }
}