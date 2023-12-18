import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    static class C {
        char s, t;

        C(char s, char t) {
            this.s = s;
            this.t = t;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof C && ((C)obj).s == s ^ ((C)obj).t == t;
        }
    }

    public static void main(String[] args) {
        char[] s = scanner.next().toCharArray();
        char[] t = scanner.next().toCharArray();
        int size = IntStream.range(0, s.length)
                .boxed()
                .map(i -> new C(s[i], t[i]))
                .collect(Collectors.toSet())
                .size();
        System.out.println(s.length == size ? "Yes" : "No");
    }
}