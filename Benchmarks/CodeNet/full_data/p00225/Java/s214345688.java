
import java.util.*;
public class Main {
	String [] list;
	boolean flg = true;
	boolean [] used;
	int n;
	

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			int [] in = new int[26];
			int [] out = new int[26];
			list = new String[n];
			for(int i = 0 ; i < n; i++){
				String s = sc.next();
				list[i] = s;
				in[s.charAt(0) - 'a']++;
				out[s.charAt(s.length() - 1) - 'a' ]++;
			}
			boolean res = isOK(in, out);
			System.out.println(res ? "OK" : "NG");
		}
	}
	
	private boolean isOK(int[] in, int[] out) {
		for(int i = 0 ; i < in.length;i++){
			if(in[i] != out[i]) return false;
		}
		
		flg = false;
		used = new boolean[26];
		dfs(0);
		
		for(int i = 0 ; i < 26; i++){
			if(in[i] > 0 && ! used[i]){
				return false;
			}
		}
		
		return true;
	}
	private void dfs(int now) {
		used[list[now].charAt(0) - 'a'] = true;
		for(int i = 0 ; i< n; i++){
			if(used[i]) continue;
			String s = list[i];
			if(list[now].charAt(list[now].length() - 1) == s.charAt(0)){
				dfs(i);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}