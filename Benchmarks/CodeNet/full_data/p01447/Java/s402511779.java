import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		return true;
	}
	
	static void solve(){
		double v = Math.log(n)/Math.log(2);
		double vv = Math.log(3)/Math.log(2);
		System.out.println((int)Math.ceil(v/vv));
	}

}