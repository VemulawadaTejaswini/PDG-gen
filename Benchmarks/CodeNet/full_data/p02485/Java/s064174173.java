import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String in;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static void solve(){
		int res = 0;
		for(int i = 0; i < in.length(); i++){
			res += in.charAt(i) - '0';
		}
		System.out.println(res);
	}
	
	static boolean read(){
		in = sc.next();
		if(in.equals("0"))return false;
		return true;
	}

}