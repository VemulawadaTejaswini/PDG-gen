import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final char[] line = reader.readLine().toCharArray();
        reader.close();

        final Deque<Integer> stack = new ArrayDeque<Integer>(line.length);
        final StringBuilder answer = new StringBuilder();

        int sum = 0;
        int count = 0;
        int indexLastZero = 0;
        final int[] process = new int[line.length + 1];
        final int[] graph = new int[line.length + 1];
        for (int i = 0; i < line.length; ++i) {
            if (stack.isEmpty()) indexLastZero = i;
            graph[i] = stack.size();
            process[i] = sum;
            switch (line[i]) {
                case '\\':
                    stack.push(i);
                    break;
                case '/':
                    if (!stack.isEmpty()) {
                        sum += i - stack.pop();
                        if (stack.isEmpty()) {
                            ++count;
                            answer.append(" ").append(sum - process[indexLastZero]);
                        }
                    }
                    break;
                default:
            }

        }
        graph[line.length] = stack.size();
        process[line.length] = sum;

        for (int i = indexLastZero + 1, min; i < graph.length;) {
            min = process.length;
            for (int j = graph.length - 1; i < j; --j) {
                if (graph[i] == graph[j] && process[i] != process[j]) {
                    min = j;
                }
            }
            if (min != process.length) {
                ++count;
                answer.append(" ").append(process[min] - process[i]);
            }
            i = min;
        }
        System.out.println(sum);
        System.out.println(count + answer.toString());
    }
}