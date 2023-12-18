import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a,b,sum=0,cnt=1;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		b = sc.nextInt();

		sum=a;

		while(sum<b) {
			sum+=(a-1);
			cnt++;
		}

		System.out.println(cnt);
	}

}
