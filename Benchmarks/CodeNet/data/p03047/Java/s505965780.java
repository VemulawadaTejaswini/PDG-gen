
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		int m = Integer.parseInt(sc.next());
		sc.close();
		System.out.println(n+1-m);
	}

}
