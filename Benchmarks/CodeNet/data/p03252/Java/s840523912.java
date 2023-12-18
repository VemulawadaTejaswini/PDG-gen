import java.util.HashSet;
import java.util.Set;

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
        Set<C> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            C c = new C(s[i], t[i]);
            if (set.contains(c)) {
                System.out.println("No");
                return;
            }
            set.add(c);
        }
        System.out.println("Yes");
    }
}