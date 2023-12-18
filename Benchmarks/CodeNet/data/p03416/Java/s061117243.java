import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int ans = 0;
        for (int i = start; i <= end; i++) {
            String num = String.valueOf(i);
            if (num.charAt(0) == num.charAt(4) && num.charAt(1) == num.charAt(3))
                ans++;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
