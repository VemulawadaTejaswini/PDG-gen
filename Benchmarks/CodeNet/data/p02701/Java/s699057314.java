

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String[] lines = new String[N];
		ArrayList<String> fruits = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			String line = sc.next();
			if(fruits.indexOf(line) == -1) {
				fruits.add(line);
			}
		}


		System.out.println(fruits.size());
	}

}
