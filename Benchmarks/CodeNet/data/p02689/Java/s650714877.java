import java.util.Scanner;

/**
 * Peaks.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = Integer.parseInt(scanner.next());
        var m = Integer.parseInt(scanner.next());
        var heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(scanner.next());
        }

        var maxHeight = new int[n];
        for (int i = 0; i < m; i++) {
            var a = Integer.parseInt(scanner.next());
            var b = Integer.parseInt(scanner.next());
            maxHeight[a - 1] = Math.max(maxHeight[a - 1], heights[b - 1]);
            maxHeight[b - 1] = Math.max(maxHeight[b - 1], heights[a - 1]);
        }
        var count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] > maxHeight[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
