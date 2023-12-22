import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number == 10000) {
			System.out.println(0);
			System.exit(0);
			
		}
		int ans = number/1000;
		
		if(number%1000 == 0) {
			System.out.println(0);
		}
		else {
			ans = 1000-(number - ans*1000);
			System.out.println(ans);
		}
		
	}

}
