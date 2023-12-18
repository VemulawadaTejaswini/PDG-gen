import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if (solution()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean solution() {
		int[] group1 = {1, 3, 5, 7, 8, 10, 12};
		int[] group2 = {4, 6, 9, 11};

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x == 2 || y == 2) {
			return false;
		}
		for(int i = 0; i < group1.length; i++) {
			if(x == group1[i]) {
				for(int j = 0; j < group1.length; j++) {
					if(y == group1[j]) {
						return true;
					}
				}
			}
		}
		for(int i = 0; i < group2.length; i++) {
			if(x == group2[i]) {
				for(int j = 0; j < group2.length; j++) {
					if(y == group2[j]) {
						return true;
					}
				}
			}
		}

		return false;

	}

}
