import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int[] in, out;
	static boolean[][] edge;
	static boolean[] visited;
	
	static void dfs(int pos) {
		visited[pos]=true;
		for(int i=0; i<26; i++) {
			if(edge[pos][i] && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				in=new int[26];
				out=new int[26];
				edge=new boolean[26][26];
				visited=new boolean[26];
				Arrays.fill(visited, true);
				String s="";
				for(int i=0; i<n; i++) {
					s=sc.next();
					int from=s.charAt(0)-'a';
					int to=s.charAt(s.length()-1)-'a';
					in[from]++;
					out[to]++;
					edge[from][to]=true;
					visited[to]=visited[from]=false;
				}
				boolean check=true;
				//1.有向グラフにおけるオイラーグラフ判定(出る次数と入る次数が同じならば良い)
				//	オイラーグラフとは･･･一筆書きしてもどってこれるグラフ
				//	(無向グラフでは全ての頂点の次数が偶数であればよい!?)
				for(int i=0; i<26; i++) {
					if(in[i]!=out[i]) {
						check=false;
						break;
					}
				}
				//2.閉路判定(全ての頂点を訪れているか判定)
				if(check) {
					dfs(s.charAt(0)-'a');
					for(int i=0; i<26; i++) {
						if(!visited[i]) {
							check=false;
							break;
						}
					}
				}
				System.out.println(check? "OK":"NG");
				
			}
			
		}
	}
}
