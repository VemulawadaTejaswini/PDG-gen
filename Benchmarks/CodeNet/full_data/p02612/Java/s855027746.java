import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int tmp=n;
		while(true) {
			tmp = tmp -1000;
			if(tmp<0) {
				System.out.println(tmp+1000);
				return;
			}else if(tmp==0) {
				System.out.println(tmp);
				return;
			}
		}

	}
}