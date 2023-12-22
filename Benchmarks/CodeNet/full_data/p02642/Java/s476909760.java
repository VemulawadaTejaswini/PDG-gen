import java.util.Scanner;

public class Main {
    static int n = 0;
    static int cnt = 0;
    static int array[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cnt += calc(i);
        }

        System.out.println(n - cnt);
    }

    private static int calc(int x) {
        for (int j = 0; j < n; j++) {
            if (x != j) {
                if (array[x] % array[j] == 0) {
                    return 1;
                }
            }
        }
        return 0;
    }
}