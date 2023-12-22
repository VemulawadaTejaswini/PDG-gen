import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a1, a2, a3, m1, m2, m3;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		a1 = sc.nextInt(); m1 = sc.nextInt();
		a2 = sc.nextInt(); m2 = sc.nextInt();
		a3 = sc.nextInt(); m3 = sc.nextInt();
		if(a1 == 0 && a2 == 0 && a3 == 0
				&& m1 == 0 && m2 == 0 && m3 == 0 ){
			return false;
		}
		return true;
	}
	static void solve(){
		int x = 1, y = 1, z = 1, count = 0;
		boolean flag = true;
		while(flag){
			x = a1*x %m1;
			y = a2*y %m2;
			z = a3*z %m3;
			count++;
			if(x == 1 && y == 1 && z == 1)flag = false;
		}
		System.out.println(count);
	}
}