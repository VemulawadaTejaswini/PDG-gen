import java.util.*;

public class Main {
	static class Trie {
		public class Node {
			HashMap<Character, Node> child;
			int[] count;
			Node parent;

			public Node() {
				child = new HashMap<>();
				count = new int[26];
			}
			public Node(Node parent) {
				child = new HashMap<>();
				count = new int[26];
				this.parent = parent;
			}
		}
		
		Node root;
		public Trie() {
			root = new Node();
		}
		
		void setString(char[] c) {
			Node cur = root;
			for(int i=c.length-1; i>=0; i--) {
				if(cur.child.get(c[i])==null) {
					cur.child.put(c[i], new Node(cur));
				}
				cur = cur.child.get(c[i]);
			}
			int bit = 0;
			int index=0;
			while(cur!=null) {
				for(int i=0; i<26; i++)
					if(((1<<i)&bit)!=0)
						cur.count[i]++;
				if(index<c.length)
					bit |= 1<<(c[index]-'a');
				index++;
				cur = cur.parent;
			}
		}
		
		int getCount(char[] c) {
			Node cur = root;
			for(int i=c.length-1; i>=1; i--) {
				cur = cur.child.get(c[i]);
			}
			return cur.count[c[0]-'a'];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[][] s = new char[N][];
		Trie trie = new Trie();
		for(int i=0; i<N; i++) {
			s[i] = sc.next().toCharArray();
			trie.setString(s[i]);
		}
		
		long ans = 0;
		for(int i=0; i<N; i++)
			ans += trie.getCount(s[i]);
		
		System.out.println(ans - N);
		sc.close();
	}
}
