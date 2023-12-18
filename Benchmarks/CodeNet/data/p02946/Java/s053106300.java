import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int x = scan.nextInt();

		for(int i=0;i<(k*2)-1;i++) {
			System.out.print(x-k+i+1 + " ");
		}
	}

}
