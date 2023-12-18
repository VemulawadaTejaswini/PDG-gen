import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		StringBuilder sbP = new StringBuilder();
		StringBuilder sbQ = new StringBuilder();
		for(int i = 0; i < n; i++){
		    sbP.append(sc.nextInt());
		}
		for(int i = 0; i < n; i++){
		    sbQ.append(sc.nextInt());
		}
		String p = sbP.toString();
		String q = sbQ.toString();
		
		// 計算
		int result = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
		    sb.append(i+1);
		}
		String s = sb.toString();
		//System.out.println(s);
		Permutation perm = new Permutation(s);
		int a = perm.list.indexOf(p) + 1;
		int b = perm.list.indexOf(q) + 1;
		result = abs(a - b);
		
		//System.out.println(perm.list);
		
		// 出力
		System.out.println(result);
	}
}

class Permutation {
    int n;
    String s;
    ArrayList<String> list;
    
    public Permutation(String s){
        this.n = s.length();
        this.s = s;
        
        boolean[] used = new boolean[n];
        ArrayList<String> list = new ArrayList<String>();
        dfs("", used, list);
        this.list = list;
    }
    
    private void dfs(String s, boolean[] used, ArrayList<String> list){
        if(s.length() == used.length){
            list.add(s);
            return;
        }
        for(int i = 0; i < used.length; i++){
            if(used[i]) continue;
            used[i] = true;
            dfs(s + this.s.charAt(i), used, list);
            used[i] = false;
        }
    }
}


