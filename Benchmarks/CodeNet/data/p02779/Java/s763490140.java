import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();
		int i = 0;
		while(i < N) {
			nums.add(scn.nextInt());
			i++;
		}

		int cnt = 0;

		for (int j = 0 ; j < nums.size()-1;) {
			int num = nums.get(j);
			System.out.println(num);
			if (num == nums.get(j+1)) {
//				System.out.println("No");
//				break;
				cnt++;
			} else {
				j++;
			}
		}

		System.out.println(cnt > 0 ? "No" : "Yes");

	}

}