import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        long k = 1;
        String prev = S.substring(0, 1);
        int start = 0;
        for (int i = 1; i < S.length(); i++) {
            String chk = S.substring(i + start, i + 1);
            if (chk.compareTo(prev) == 0) {
                start--;
            } else {
                prev = S.substring(i + start, i + 1);
                start = 0;
                k++;
            }
        }

        System.out.println(k);
    }

}
