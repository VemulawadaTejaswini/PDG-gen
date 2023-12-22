import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double a, b;
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		a = sc.nextDouble();
		b = sc.nextDouble();
		n = sc.nextInt();
		return true;
	}
	
	static void solve(){
		int res = 0;
		String s = new Double(a/b).toString()+"000";
		for(int i = 2; i < n+2; i++){
			res += s.charAt(i) - '0';
		}
		System.out.println(res);
	}

}