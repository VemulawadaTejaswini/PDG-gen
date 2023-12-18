import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int a = (int)(n/1.08);
		int x1 = (int)(a*1.08);
		int x2 = (int)((a+1)*1.08);
		if((x1 == n) && (x2 == n)) {
			System.out.println(a);
		}
		else if(x1 == n){
			System.out.println(a);
		}
		else if(x2 == n) {
			System.out.println(a+1);
		}
		else {
			System.out.println(":)");
		}
	}
}
