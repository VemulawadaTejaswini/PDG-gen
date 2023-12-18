import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner ok =new Scanner(System.in);
		int n = ok.nextInt();
		int sum=0;

		for(int i=0;i<n;i++) {

			int k = ok.nextInt();
			int r = ok.nextInt();
			sum=sum+k-r;
		}
		System.out.println(sum);
	}

}
