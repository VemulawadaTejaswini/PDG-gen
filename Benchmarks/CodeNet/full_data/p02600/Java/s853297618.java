import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        if(N < 600) {
            ans = 8;
        }else if(N < 800) {
            ans = 7;
        }else if(N < 1000) {
            ans = 6;
        }else if(N < 1200) {
            ans = 5;
        }else if(N < 1400) {
            ans = 4;
        }else if(N < 1600) {
            ans = 3;
        }else if(N < 1800) {
            ans = 2;
        }else if(N < 2000) {
            ans = 1;
        }
        System.out.println(ans);

    }
}