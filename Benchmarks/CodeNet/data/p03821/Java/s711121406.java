import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        long totalInc = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            a[i] += totalInc;
            totalInc = totalInc + next_mul(a[i], b[i]) - a[i];
        }
        System.out.println(totalInc);
    }

    private static long next_mul(long a, long b){
        if (a/b < 0 || a % b == 0) return a;
        else return (a/b + 1)*b;
    }
}
