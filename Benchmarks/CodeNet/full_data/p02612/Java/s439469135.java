import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a>0) {
			a=a-1000;
		};
		a=a*-1;
        System.out.println(a);

	}

}
