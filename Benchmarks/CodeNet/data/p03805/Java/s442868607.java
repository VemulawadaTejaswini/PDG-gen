import java.util.*;

public class Main {
	
	static Set<String> permutations = new HashSet<String>();
	static int N;
	static char base[]; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		int to [][] = new int[N+1][N+1];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			to[a][b] = 1;
			to[b][a] = 1;
		}
		sc.close();
			
		//1~Nの順列を全列挙する。
		
		StringBuilder sb = new StringBuilder();
 
		
		base = new char[N];
		for(int i=1;i<=N;i++) base[i-1]= (char)(i+'0');
		
		for(int i=0;i<N;i++) {
			char start[] = new char[N];
			start[0] = base[i];
			dfs(start);
		}
		
		int cnt = 0;
		//search all permutations
		for(String tmp : permutations) {
			int len = tmp.length();
			for(int i=0;i<len-1;i++) {
				int now = tmp.charAt(i)-'0';
				int next = tmp.charAt(i+1)-'0';
				if(i==0) {
					if (now !=1)break;
				}
				if(to[now][next]==0)break;
				if(i==len-2) cnt++;
			}
		}
		System.out.println(cnt);
//		System.out.println(permutations.size());

//		for(String tmp : permutations) {
//			System.out.println(tmp);
//		}
		
	}
	
	static void dfs(char c[]) {
		if(finished(c)) {
			permutations.add(new String(c));
			return;
		}
		for(int i=0;i<N;i++) {
			char nextChar = base[i];
			if(isContain(c, nextChar)) continue;
			char nextC[] = c.clone();
			nextC[depth(c)]=nextChar;
			dfs(nextC);
		}
	}
	
	static boolean isContain(char target[], char c) {
		for(char t :target) if(c==t) return true;
		return false;
	}
	
	static boolean finished(char target[]) {
		if(isContain(target, '\u0000'))return false;
		return true;
	}
	
	static int depth(char target[]) {
		int cnt = N;
		for(char t:target) {
			if(t=='\u0000')cnt--;
		}
		return cnt;
	}
	
}
