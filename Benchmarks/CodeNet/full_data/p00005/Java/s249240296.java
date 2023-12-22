import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a, b;
		int GCD = 0, LCM = 0;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			GCD = 0;
			LCM = 0;
			/* 最大公約数 */
			for (int i = 1; i <= Math.min(a, b); i++) {
				if ((a % i == 0) && (b % i == 0)) {
					GCD = i;
				}
			}
			/* 最小公倍数 */
			for (int i = 1; i <= Math.min(b, 2000000000); i++) {
				 if((a*i)%b==0){
					 LCM = a*i;
					 break;
				 }
			}
			System.out.println(GCD+" "+LCM);
		}
	}

}