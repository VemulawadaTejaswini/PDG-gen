import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set keihin = new HashSet();
		for (int i = 0; i < n; i++) {
			keihin.add(sc.next());
		}
		System.out.println(keihin.size());


	}

}
