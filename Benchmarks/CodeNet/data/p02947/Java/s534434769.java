import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();

        Map<Map<Character, Integer>, Integer> anagrams = new HashMap<>();

        long ans = 0;
        for (int i=0; i < n; i++) {
            Anagram a = new Anagram(in.next());
            if (anagrams.containsKey(a.chars)) {
                int j = anagrams.get(a.chars);
                ans += j;
                anagrams.put(a.chars, j + 1);
            }
            else
                anagrams.put(a.chars, 1);
        }

        out.println(ans);
    }

    private static class Anagram {
        Map<Character, Integer> chars;

        private Anagram(String s) {
            this.chars = new HashMap<>();
            for (char ch : s.toCharArray()) {
                if (!this.chars.containsKey(ch))
                    this.chars.put(ch, 1);
                else
                    this.chars.put(ch, this.chars.get(ch) + 1);
            }
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj) && obj instanceof Anagram && ((Anagram) obj).chars.equals(this.chars);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(this.chars);
        }
    }

}
