import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String r = sc.next();
			list.add(r);
		}
		sc.close();
		if(list.contains("Y")) {
			System.out.println("Four");
		}else {
			System.out.println("Three");
		}
	}

}