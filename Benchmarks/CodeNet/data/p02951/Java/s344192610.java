import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int ans = (A - B) - C;
        if(ans < 0) ans = Math.abs(ans);
        else ans = 0;

        System.out.println(ans);
    }
}
