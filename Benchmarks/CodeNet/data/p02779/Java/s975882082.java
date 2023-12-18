import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean[] A = new boolean[1000000001];

        int a;
        for (int i = 0; i < N; i++) {
            a = sc.nextInt();
            if (!A[a]) {
                A[a] = true;
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
