import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a,b,sum=1,cnt=0;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		b = sc.nextInt();

		while(sum<b) {
			sum+=(a-1);
			cnt++;
		}

		System.out.println(cnt);
	}

}