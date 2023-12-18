import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int size = s.length();
        int[] sequence = new int[100000];
        int idx = 0;
        int prevIdx = 0;
        int prev = s.charAt(0) - '0';
        for (int i = 1; i < size; i++) {
            int current = s.charAt(i) - '0';
            if (current != prev) {
                sequence[idx] = i - prevIdx;
                prevIdx = i;
                prev = current;
                idx++;
            }
        }
        sequence[idx] = size - prevIdx;

        int sum = 0;
        int least = Integer.MAX_VALUE;
        for (int i = 0; i <= idx; i++) {
            sum += sequence[i];
            least = Math.min(Math.max(sum, size - sum), least);
        }
        System.out.println(least);
    }
}
