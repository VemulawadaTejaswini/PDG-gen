import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private long n,money;


	private void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();
		money = 100000;
		for(int i = 0;i < n;i++) {
			looprun();
		}

		System.out.println(money);

		scan.close();

	}

	private void looprun() {
		money += (long)(money * 0.05);

		if(money % 1000 != 0) {
			money += 1000 - money % 1000;
		}
	}
}
