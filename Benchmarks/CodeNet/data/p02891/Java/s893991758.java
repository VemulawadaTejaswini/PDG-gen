import java.util.Scanner;

public class Main {
    static StringBuilder S;
    static int K;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        S = new StringBuilder(scanner.nextLine());
        K = scanner.nextInt();
        scanner.close();
    }

    public static void main(String args[]) {
        init();

        StringBuilder T = new StringBuilder(S);

        long count = 0;
        int head = T.charAt(0);
        for(int i = 1; i < T.length(); i++) {
            int prev = T.charAt(i - 1);
            int cur = T.charAt(i);

            boolean update = false;
            while (prev == cur) {
                if(cur == 127) {
                    cur = -128;
                }
                cur++;
                if(cur == head) cur++;
                update = true;
            }
            if(update) count++;
            T.setCharAt(i, (char) cur);
        }

        System.out.println(count * K);
    }
}