import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			list.add(a);
		}

		for(int j = list.size()-1;j >= 0 ; j--) {
			if(j == 0) {
				System.out.println(list.get(0));
			} else {
				System.out.print(list.get(j) + " ");
			}
		}

	}

}

