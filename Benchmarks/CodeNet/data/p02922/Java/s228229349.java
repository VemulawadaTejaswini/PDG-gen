import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int num = 1;
        int ans = 0;
        while(num < B) {
            ans++;
            num += (A - 1);
        }

        System.out.println(ans);
    }
}
