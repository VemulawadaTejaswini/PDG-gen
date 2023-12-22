import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Verbal Arithmetic
public class Main{

	static String[] s;
	static int id;
	static int ans;
	static Map<Character, Integer> ref;
	static Set<Integer> nonzero;
	static int n;
	
	static int[] assign;
	static boolean[] used;
	static boolean[] decided;
	
	static void leaf(int k, int sum){
		if(k==n){
			dfs(0);
			return;
		}
		int x = ref.get(s[k].charAt(s[k].length()-1));
		if(decided[x]){
			leaf(k+1, sum+assign[x]);
			return;
		}
		for(int i=0;i<10;i++){
			if(!used[i]){
				if(i==0 && nonzero.contains(x))continue;
				used[i] = true;
				assign[x] = i;
				decided[x] = true;
				leaf(k+1, sum+i);
				used[i] = false;
				decided[x] = false;
			}
		}
	}
	
	static void dfs(int k){
		if(k==id){
			int sum = 0;
			for(int i=0;i<n-1;i++)sum+=f(i);
			ans += sum==f(n-1)?1:0;
			return;
		}
		if(decided[k]){
			dfs(k+1);
			return;
		}
		for(int i=0;i<10;i++){
			if(used[i])continue;
			if(i==0 && nonzero.contains(k))continue;
			used[i] = true;
			assign[k] = i;
			dfs(k+1);
			used[i] = false;
		}
	}
	
	static int f(int k){
		int sum = 0;
		for(int i=0;i<s[k].length();i++){
			sum *= 10;
			sum += assign[ref.get(s[k].charAt(i))];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n==0)break;
			s = new String[n];
			ref = new HashMap<Character, Integer>();
			id = 0;
			ans = 0;
			nonzero = new HashSet<Integer>();
			for(int i=0;i<n;i++){
				s[i]=sc.next();
				for(int j=0;j<s[i].length();j++){
					char c = s[i].charAt(j);
					if(!ref.containsKey(c)){
						ref.put(c, id++);
					}
				}
				if(s[i].length()>1)
					nonzero.add(ref.get(s[i].charAt(0)));
			}
			assign = new int[id];
			decided = new boolean[id];
			used = new boolean[10];
			leaf(0, 0);
			System.out.println(ans);
		}
	}
}