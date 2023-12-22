import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static class LenComparator implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			return o1.length() - o2.length();
		}
	}
	static class Trie{
		int firsts[];
		Trie children[];
		public Trie() {
			firsts = null; // new int[26];
			children = new Trie[26];
		}
		
		void add(char arr[] , int index, int first){
			if(index == arr.length){
				if(firsts == null){
					firsts = new int[26];
				}
				firsts[first]++;
			}else{
				int c = arr[index] - 'a';
				if(children[c] == null){
					children[c] = new Trie();
				}
				children[c].add(arr, index + 1, first);
			}
		}
		
		long hit(char arr[] , int index, int vis[]){
			if(index == arr.length){
				if(firsts == null){
					return 0;
				}
				long ret = 0;
				for(int i = 0 ; i < 26 ; ++i){
					ret += vis[i] * firsts[i];
				}
				return ret;
			}else{
				int c = arr[index] - 'a';
				if(children[c] == null){
					return 0;
				}
				return children[c].hit(arr, index + 1, vis);
			}
		}
	}
	static long solve(String S[]){
		Arrays.sort(S, new LenComparator());
		long tot = 0;
		Trie root = new  Trie();
		for(String s : S){
			char arr[] = s.toCharArray();
			int vis[] = new int[26];
			vis[s.charAt(0) - 'a'] = 1; 
			for(int i = 1; i <= s.length() ; ++i){
				tot += root.hit(arr , i , vis);
				if(i < s.length()){
					vis[s.charAt(i) - 'a'] = 1;					
				}
			}
			char s0 = s.charAt(0);
			root.add(arr, 1, s0 - 'a');
		}
		return tot;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		String S[] = new String[N];
		for(int i = 0 ; i < N ; ++i){
			S[i] = sc.next();			
		}
		long ret = solve(S);
		System.out.println(ret);
	}
}
