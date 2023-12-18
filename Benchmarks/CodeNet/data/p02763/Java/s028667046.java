import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int Q = sc.nextInt();
		TreeSet<Integer>[] t = new TreeSet[26];
		for(int i = 0; i < 26; i++)
			t[i] = new TreeSet<Integer>();
		for(int i = 0; i < N; i++)
			t[s[i]-'a'].add(i);
		for(int i = 0; i < Q; i++){
			if(sc.nextInt() == 1) {
				int q = sc.nextInt()-1;
				char c = sc.next().charAt(0);
				t[s[q]-'a'].remove(q);
				t[c-'a'].add(q);
				s[q] = c;
			}
			else {
				int ans = 0;			
				int l =  sc.nextInt()-1, r = sc.nextInt()-1;
				for(char j = 0; j < 26; j++)
						if(t[j].ceiling(l) != null && t[j].ceiling(l) <= r)
							ans++;
				System.out.println(ans);
			}
		}

	}

}