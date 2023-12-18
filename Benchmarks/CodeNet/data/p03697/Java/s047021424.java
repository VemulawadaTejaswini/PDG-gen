import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		int sum = h+w;
		if(sum>=10) {
			System.out.println("error");
		}else {
		System.out.println(sum);
		}
	}

}
