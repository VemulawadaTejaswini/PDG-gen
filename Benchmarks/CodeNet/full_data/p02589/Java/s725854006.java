import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ss = new String[n]; 
		for(int i=0;i<n;i++) {
			String s = sc.next();
			StringBuilder sb = new StringBuilder(s);
			sb.append('x');
			s = sb.reverse().toString();
			ss[i] = s;
		}
		sc.close();
		Arrays.sort(ss, (i, j)->i.length() - j.length());
		Trie trie = new Trie();
		for(int i=0;i<n;i++) {
			trie.insert(ss[i]);
		}
		System.out.println(trie.cnt);
	}
}

class Trie {

	static class TrieNode{
		TrieNode[] links;
		final int R = 26;
		boolean isEnd;
		Set<Character> needChars;//extension
		public TrieNode() {
			links = new TrieNode[R];
			needChars = new HashSet<>();
		}
		public boolean containKey(char ch) {
			return links[ch - 'a'] != null;
		}
		public TrieNode get(char ch) {
			return links[ch - 'a'];
		}
		public void put(char ch, TrieNode node) {
			links[ch - 'a'] = node;
		} 
		public void setEnd() {
			isEnd = true;
		}
	}

	
	TrieNode root;
	int cnt = 0;
	
    /** Initialize your data structure here. */
    public Trie() {
    	root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
    	int[] cCnt = new int[26];
    	for(int i=0;i<word.length();i++) {
    		cCnt[word.charAt(i)-'a']++;
    	}
    	char last = word.charAt(word.length()-1);
    	word = word.substring(0, word.length()-1);
        TrieNode node = root;
        for(int i=0;i<word.length();i++) {
        	char ch = word.charAt(i);
        	cCnt[ch - 'a']--;
        	if(!node.containKey(ch)) {
        		node.put(ch, new TrieNode());
        	}
        	node = node.get(ch);
        	if(node.isEnd) {
        		for(char c : node.needChars) {
        			if(cCnt[c - 'a'] > 0)cnt++;        			
        		}
        	}
        }
        node.setEnd();
        node.needChars.add(last);
    }
    

}