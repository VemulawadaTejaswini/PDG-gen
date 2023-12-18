import java.util.*;

public class Main {
    static class TrieNode {
        public char val;
        public boolean isWord;
        public HashMap<Character, TrieNode> children = new HashMap<>();

        public TrieNode() {}
        TrieNode(char c){ this.val = c; }

        public TrieNode get(char c) {
            if (children.containsKey(c)) return children.get(c);
            return null;
        }

        @Override
        public String toString() { return String.format("Node: %s", this.val); }
    }

    static class Trie {
        private TrieNode root;
        public Trie() {
            root = new TrieNode();
            root.val = ' ';
        }

        public void insert(String word) {
            TrieNode ws = root;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(ws.get(c) == null){
                    ws.children.put(c, new TrieNode(c));
                }
                ws = ws.get(c);
            }
            ws.isWord = true;
        }
    }

    static Trie construct() {
        Trie trie = new Trie();
        int multiple = 2019;
        while (multiple <= 200000) {
            trie.insert(String.valueOf(multiple));
            multiple += 2019;
        }
        return trie;
    }

    static int numOfMultiples(Trie trie, int idx, String word) {
        int result = 0;
        TrieNode node = trie.root;
        while (idx < word.length() && node != null) {
            node = node.get(word.charAt(idx));
            if (node != null && node.isWord) result++;
            idx++;
        }
        return result;
    }

    public static void main(String[] args) {
        Trie trie = construct();
        int result = 0;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            result += numOfMultiples(trie, i, word);
        }
        System.out.println(result);
    }
}