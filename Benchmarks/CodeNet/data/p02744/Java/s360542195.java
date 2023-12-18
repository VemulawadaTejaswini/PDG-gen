import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		Permutation perm = new Permutation(n);
		
		// 出力
		for(String r : perm.list){
		    System.out.println(r);
		}
		//char result = 'a' + 3;
		//System.out.println(result);
	}
}

class Permutation {
    int n;
    String s;
    ArrayList<String> list;
    long cnt = 0;
    
    /*
    public Permutation(String s, int n){
        this.n = n;
        this.s = s;
        
        boolean[] used = new boolean[n];
        ArrayList<String> list = new ArrayList<String>();
        dfs("", used, list);
        this.list = list;
    }*/
    
    public Permutation(int n){
        this.n = n;
        //String t = "abcdefghijklmn";
        //this.s = t.substring(0, n);
        
        ArrayList<String> list = new ArrayList<String>();
        dfs("", 1, list);
        this.list = list;
    }
    
    private void dfs(String s, int now, ArrayList<String> list){
        this.cnt++;
        if(s.length() == n){
            list.add(s);
            return;
        }
        for(int i = 0; i < now; i++){
            char c = (char)('a' + i);
            //System.out.println("i:" + i + " now:" + now + " char:" + c);
            if(i == n-1){
                dfs(s + c, i+1, list);
            }else{
                dfs(s + c, i+2, list);
            }
        }
    }
}


