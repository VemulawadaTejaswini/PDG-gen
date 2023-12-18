import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();

        for(int i = 0; i < S.length(); i++) {
            int n = (int)S.charAt(i) + N;
            if(n > 90) n -= 26;
            char c = (char)(n);
            System.out.print(c);
        }
    }
}
