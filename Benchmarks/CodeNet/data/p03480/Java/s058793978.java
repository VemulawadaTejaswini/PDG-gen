import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] sequence = new int[100000];
        int idx = 0;
        int prevIdx = 0;

        int first = s.charAt(0) - '0';
        int last = s.charAt(s.length() - 1) - '0';

        int prev = first;
        int current;
        for (int i = 1; i < s.length(); i++) {
            current = s.charAt(i) - '0';
            if (current != prev) {
                sequence[idx] = i - prevIdx;
                prevIdx = i;
                prev = current;
                idx++;
            }
        }
        sequence[idx] = s.length() - prevIdx;

        if (idx <= 1) {
            System.out.println(Math.max(sequence[0], sequence[1]));
        } else {
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= idx; i++) {
                int tmp = sequence[i - 1] + sequence[i];
                if (tmp >= max) {
                    max = tmp;
                    int a = 0, b = 0;
                    for (int j = 0; j <= idx; j++) {
                        if (j <= i) {
                            a += sequence[j];
                        }
                        if (j >= i) {
                            b += sequence[j];
                        }
                    }
                    min = Math.max(Math.min(a, b), min);
                }
            }
            System.out.println(Math.min(max, min));
        }
    }
}
