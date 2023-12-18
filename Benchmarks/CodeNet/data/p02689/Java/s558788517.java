import java.util.Scanner;

/**
 * Peaks.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        var maxHeight = new int[n];
        for (int i = 0; i < m; i++) {
            var a = scanner.nextInt();
            var b = scanner.nextInt();
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
