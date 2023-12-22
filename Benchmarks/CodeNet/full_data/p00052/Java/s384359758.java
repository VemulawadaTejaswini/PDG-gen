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
		n = sc.nextInt();
		if(n == 0)return false;
		return true;
	}
	static void solve(){
		int res = 0;
		while(n >= 5){
			res += n/5;
			n = n/5;
		}
		System.out.println(res);
	}
}