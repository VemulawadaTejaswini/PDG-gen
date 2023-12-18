import java.util.Scanner;

public class Main {
    static int N;
    static int[] a;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        a = new int[N];
        for(int i = 0; i < N; i++) a[i] = scanner.nextInt();

        scanner.close();
    }

    private static boolean check() {

        boolean ok = true;
        for(int i = 0; i < N; i++) {
            if(a[i] % 2 != 0) {
                ok = false;
                break;
            }
        }
        return ok;
    }


    public static void main(String args[]) {
        init();

        int count = 0;
        while (true) {
            if(check()) {
                count++;
                for(int j = 0; j < N; j++) {
                    a[j] = a[j] / 2;
                }
            } else {
                break;
            }
        }

        System.out.println(count);


    }
}
