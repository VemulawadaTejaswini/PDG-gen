import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static String[][] table;
	static String[] str;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		table = new String[n][2];
		for(int i = 0; i < table.length; i++){
			table[i][0] = sc.next();
			table[i][1] = sc.next();
		}
		m = sc.nextInt();
		str = new String[m];
		for(int i = 0; i < str.length; i++){
			str[i] = sc.next();
		}
		return true;
	}
	
	static void solve(){
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < str.length; j++){
				if(str[j].equals(table[i][0]))str[j] = table[i][1];
			}
		}
		String res = "";
		for(int i = 0; i < str.length; i++){
			res += str[i];
		}
		System.out.println(res);
	}

}