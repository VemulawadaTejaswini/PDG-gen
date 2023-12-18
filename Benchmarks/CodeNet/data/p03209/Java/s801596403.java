import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		
		String burger = "";
		//以下ループでレベルNのバーガーを作り上げる。
		for(int i=0;i<=N;i++) {
			if (i==0) {
				burger="P"; 
			}else {
				burger = makeBurger(burger);
			}
		}
		
		//後ろからX番目までに、何回Pがあるか調べる
		int ans = 0;
		int lowest = burger.length();
		for(int i=0;i<X;i++) {
			if('P'==(burger.charAt(lowest-i-1))){
				ans++;
			}
		}	
		System.out.println(ans);
	}
	
	//kレベルのバーガーから、k+1レベルのバーガーを作る事を繰り返し、レベルnのバーガーを返すメソッド
	static String makeBurger(String burger) {
		StringBuilder sb = new StringBuilder();
		String burger_plus;  
		sb.append("B");
		sb.append(burger);
		sb.append("P");
		sb.append(burger);
		sb.append("B");
		burger_plus = sb.toString();
		return burger_plus;
	}
	
}
