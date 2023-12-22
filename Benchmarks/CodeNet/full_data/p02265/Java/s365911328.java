import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final Deque<String> numbers = new ArrayDeque<String>(1000000);

        final int n = Integer.parseInt(reader.readLine());

        String line;
        for (int i = 0; i < n; ++i) {
            line = reader.readLine();
            if ('i' == line.charAt(0)) {
                numbers.offerFirst(line.substring(7));

            }else if ('F' == line.charAt(6)) {
                numbers.remove();

            } else if ('L' == line.charAt(6)) {
                numbers.removeLast();

            } else {
                numbers.removeFirstOccurrence(line.substring(7));
            }
        }

        final StringBuilder answer = new StringBuilder();
        answer.append(numbers.poll());
        while (numbers.size() != 0) {
            answer.append(" ").append(numbers.poll());
        }

        System.out.println(answer.toString());
    }
}