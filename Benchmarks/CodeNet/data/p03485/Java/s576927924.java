import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		double c = (double)(a+b)/2;
		//System.out.println(c);
		double syosuC = c-(int)c;
		int ans=0;
		if(syosuC>0) {
			ans = (int)c+1;
		}else {
			ans = (int)c;
		}
		System.out.println(ans);
	}

}
