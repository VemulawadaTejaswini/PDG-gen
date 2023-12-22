import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static char[] arrays;
	static HashMap<Character, Character> map = new HashMap<Character, Character>();
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if( n == 0 )return false;
		for(int i = 0; i < n; i++){
			map.put(sc.next().charAt(0), sc.next().charAt(0));
		}
		int m = sc.nextInt();
		arrays = new char[m];
		for(int i = 0; i < arrays.length; i++){
			arrays[i] = sc.next().charAt(0);
		}
		return true;
	}
	
	static void solve(){
		for(int i = 0; i < arrays.length; i++){
			if( map.containsKey(arrays[i]) ) arrays[i] = map.get(arrays[i]);
		}
		String res = "";
		for(int i = 0; i < arrays.length; i++){
			res += Character.toString(arrays[i]);
		}
		System.out.println(res);
	}

}