import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();

        String[] texts = new String[n];
        for (int i = 0; i < n; i++) {
            texts[i] = std.next();
        }

        String[] sortedTexts = new String[n];

        for (int i = 0; i < n; i++) {
            String text = texts[i];
            String sorted = Arrays.stream(text.split("")).sorted().collect(Collectors.joining());
            sortedTexts[i] = sorted;
        }

        boolean[] visited = new boolean[n];

        PriorityQueue<Integer> deque = new PriorityQueue<>(n);
        deque.add(0);
        long count = 0;
        while (!deque.isEmpty()) {
            int v = deque.poll();
            if (visited[v]) {
                continue;
            }

            visited[v] = true;
            String text = sortedTexts[v];
            for (int i = 0; i < n; i++) {
                if (v == i) {
                    continue;
                }

                if (text.equals(sortedTexts[i])) {
                    count++;
                }
                if (!deque.contains(i)) {
                    deque.add(i);
                }
            }
        }

        count = count / 2;

        System.out.println(count);
    }
}
