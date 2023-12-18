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
            for (int i = 1; i <= idx; i++) {
                int tmp = sequence[i - 1] + sequence[i];
                max = Math.max(tmp, max);
            }
            System.out.println(max);
        }
    }
}
