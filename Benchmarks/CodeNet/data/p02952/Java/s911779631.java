import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        for(int i = 1; i <= N && i < 10; i ++) {
            ans++;
        }
        for(int i = 100; i <= N && i < 1000; i ++) {
            ans++;
        }
        for(int i = 10000; i <= N && i < 100000; i ++) {
            ans++;
        }
        System.out.println(ans);
    }
}
