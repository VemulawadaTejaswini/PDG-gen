import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m, p;
	static int[] commodity;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt(); m = sc.nextInt();
		if(n == 0 && m == 0)return false;
		commodity = new int[n];
		for(int i = 0; i < n; i++)
			commodity[i] = sc.nextInt();
		return true;
	}
	static void solve(){
		int nBag = n/m;
		java.util.Arrays.sort(commodity);
		for(int i = 1; i <= nBag; i++)
			commodity[n - m*i] = 0;
		int Sum = 0;
		for(int i = 0; i < n; i++)
			Sum += commodity[i];
		System.out.println(Sum);
	}
}