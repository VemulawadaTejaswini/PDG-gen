import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += sc.nextInt();
        }
        System.out.println(n-sum>=0 ? n-sum : -1);
    }
}
