package abc164;

import java.util.Scanner;
import java.util.ArrayList;

public class Gacha {

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

//		fruits.add(lines[0]);
//		for(int i = 1; i < N; i++) {
//			for(int j = 0; j < fruits.size(); j++) {
//				if(fruits.indexOf(lines[i]) == -1) {
//					fruits.add(lines[i]);
//				}
//				else {
//
//				}
//			}
//		}

		System.out.println(fruits.size());
	}

}
