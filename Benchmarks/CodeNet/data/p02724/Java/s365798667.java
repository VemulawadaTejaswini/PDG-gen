import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int yen500 = 0;
		int yen5 = 0;

		for(;;) {
			if(money >= 500) {
				money -= 500;
				yen500 += 1;
			}else {
				break;
			}
		}
		for(;;) {
			if(money >= 5) {
				money -= 5;
				yen5 += 1;
			}else {
				break;
			}
		}
		System.out.println(yen500 * 1000 + yen5 * 5);

		scan.close();
	}
}