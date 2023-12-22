import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

class Puddle {
    int pos;
    int area;

    Puddle(int pos, int area) {
        this.pos = pos;
        this.area = area;
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            Deque<Integer> downStack = new LinkedList<>();
            Deque<Puddle> puddleStack = new ArrayDeque<>();

            char[] line = in.readLine().toCharArray();
            int A = 0;
            for (int i = 0; i < line.length; i++) {
                char c = line[i];
                if (c == '\\') {
                    downStack.addFirst(i);
                } else if (c == '/') {
                    if (downStack.isEmpty()) continue;

                    int downPos = downStack.removeFirst();
                    int area = i - downPos;
                    A += area;
                    while (!puddleStack.isEmpty() && puddleStack.peekFirst().pos > downPos) {
                        area += puddleStack.removeFirst().area;
                    }

                    puddleStack.addFirst(new Puddle(downPos, area));
                }
            }

            int k = puddleStack.size();
            String[] L = new String[puddleStack.size()];
            for (int i = 0; i < k; i++) {
                L[i] = String.valueOf(Objects.requireNonNull(puddleStack.pollLast()).area);
            }

            System.out.println(A);

            StringBuilder sb = new StringBuilder();
            sb.append(k);
            if (k > 0) {
                sb.append(" ");
                sb.append(String.join(" ", L));
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
