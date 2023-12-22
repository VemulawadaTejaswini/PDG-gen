import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int count = 1;
		int max = 1000;



		while(true) {
			if(max*count>=n) {
				break;
			}
			count++;
		}

		System.out.println(max*count-n);

	}

}
