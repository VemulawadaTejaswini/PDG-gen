import java.util.Scanner;

public class Main {
    static int N;
    static int[] a;
    static int[] b;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        a = new int[N + 1];
        b = new int[N];
        for(int i = 0; i <= N; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++) {
            b[i] = scanner.nextInt();
        }
        scanner.close();
    }


    public static void main(String[] args) {
        init();

        int kill = 0;
        for(int i = 0; i < N; i++) {
            int remainPowser = 0;
            if(b[i] > a[i]) {
                remainPowser = Math.min(b[i] - a[i], a[i + 1]);
            }
            kill += Math.min(a[i], b[i]) + remainPowser;
        }

        System.out.println(kill);
    }
}
