import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if (Math.abs(m-n) > 1){
			System.out.println(0);
			return;
		}
		else{
			int res = amari(kaijyo(m),kaijyo(n));
			System.out.println(res);
			return;
		}
	}
	
	static int kaijyo(int a){
		long ans = 1;
		for (int i=1; i<=a; i++){
			ans *= i;
			ans = ans % (int)(Math.pow(10, 9)+7);
		}
		return (int)ans;
	}
	
	static int amari(int a, int b){
		long ans;
		if (a == b){
			ans = (long)a*b*2 % (int)(Math.pow(10, 9)+7);	
		}
		else{
			ans = (long)a*b % (int)(Math.pow(10, 9)+7);
		}
		return (int)ans;
	}
}
