
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n];
        Queue<Integer> b = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        for (int i = 0; i < n; i++) {
            b.add(Integer.parseInt(scan.next()));
        }
        scan.close();

        StringBuilder sb = new StringBuilder();
        int cursor = 0;
        int loopCnt = 0;
        while (cursor < n) {
            int now = b.poll();
            if (a[cursor] != now) {
                sb.append(now);
                sb.append(" ");
                cursor++;
                loopCnt = 0;
            } else {
                b.add(now);
                loopCnt++;
            }

            if (loopCnt > n - cursor) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        System.out.println(sb.toString());
    }
}
