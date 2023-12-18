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

        Map<Anagram, Integer> anagrams = new HashMap<>();

        long ans = 0;
        for (int i=0; i < n; i++) {
            Anagram a = new Anagram(in.next());
            if (anagrams.containsKey(a)) {
                int j = anagrams.get(a);
                ans += j;
                anagrams.put(a, j + 1);
            }
            else
                anagrams.put(a, 1);
        }

        out.println(ans);
    }

    private static String random() {
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        for (int i=0; i < 10; i++) {
            s.append('a' + r.nextInt(26));
        }
        return s.toString();
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
            return obj instanceof Anagram && ((Anagram) obj).chars.equals(this.chars);
        }

        @Override
        public int hashCode() {
            int hash = 0;
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(this.chars.entrySet());
            list.sort(((o1, o2) -> o1.getKey() - o2.getKey()));
            for (Map.Entry<Character, Integer> e : list) {
                hash = Objects.hash(hash, e.getKey(), e.getValue());
            }
            return hash;
        }
    }

}
