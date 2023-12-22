import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static int n;
    private static Deque<Deque<String>> stack;

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        while ((n = scanner.nextInt()) != 0) {
            stack = new ArrayDeque<>();
            IntStream.range(0, n)
                .forEach(i -> {
                        String l = scanner.next();
                        int level = l.replaceFirst("[^.]", "").length();                        // System.err.printf("level:%d%n",level);
                        if (stack.size() <= level) {
                            stack.add(new ArrayDeque<String>());
                        }
                        calc(level);
                        stack.peekLast().add(l.substring(l.length() - 1));
                    });
            calc(0);
            System.out.println(stack.pop().pop());
        }
    }
    private static void calc(int level) {
        while (stack.size() > level + 1) {
            Deque<String> args = stack.pollLast();
            if (stack.isEmpty()) break;
            String operator = stack.peekLast().pollLast();
            if (operator.equals("*")) {
                // Specified (Long sum, String a) and (Long a, Long b) to avoid the compiler bug
                // https://bugs.openjdk.java.net/browse/JDK-8129589
                // JDK on Aizu Online Judge is too old!!
                stack.peekLast().push(String.valueOf(args.stream().reduce(1l, (Long sum, String a) -> sum * Long.parseLong(a), (Long a, Long b) -> a * b)));
            } else if (operator.equals("+")) {
                stack.peekLast().push(String.valueOf(args.stream().reduce(0l, (Long sum, String a) -> sum + Long.parseLong(a), (Long a, Long b) -> a + b)));
            }
        }
    }
}

