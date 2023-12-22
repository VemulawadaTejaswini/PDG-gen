import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[n];
        Trie root = new Trie();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            strings[i] = str;
            char[] s = str.toCharArray();
            Trie tmp = root;
            for (int j = s.length - 1; j >= 0; j--) {
                int c = s[j] - 'a';
                if (tmp.children == null) tmp.children = new Trie[26];
                if (tmp.children[c] == null) tmp.children[c] = new Trie();
                tmp = tmp.children[c];
            }
            tmp.isWord = true;
        }
        long ans = 0;
        for (String str : strings) {
            char[] s = str.toCharArray();
            Trie tmp = root;
            Set<Integer> suffix = new HashSet<>();
            for (int j = s.length - 1; j >= 0; j--) {
                int c = s[j] - 'a';
                suffix.add(c);
                tmp = tmp.children[c];
                for (Integer sfx : suffix) {
                    if(tmp.children!=null && tmp.children[sfx]!=null && tmp.children[sfx].isWord) ans++;
                }
            }
        }
        System.out.println(ans-n);
    }

    private static class Trie {
        boolean isWord;
        Trie[] children;
    }
}
