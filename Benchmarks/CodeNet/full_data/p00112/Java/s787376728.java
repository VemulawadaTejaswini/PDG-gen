import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, time;
	static int[] customer, wait;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		customer = new int[n];
		wait  = new int[n];
		for(int i = 0; i < n; i++){
			customer[i] = sc.nextInt();
		}
		return true;
	}
	static void solve(){
		int res = 0;
		java.util.Arrays.sort(customer);
		for(int i = 1; i < n; i++){
			wait[i] = customer[i-1] + wait[i-1];
		}
		for(int i = 0; i < n; i++){
			res += wait[i];
		}
		System.out.println(res);
	}
}