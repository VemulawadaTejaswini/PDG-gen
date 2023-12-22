import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int sum = 0;
        for(int i = 4; i < S.length(); i++) {
            for(int j = 0; i + j <= S.length(); j++) {
                long val = Long.valueOf(S.substring(j, j + i));
                if(val % 2019 == 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}