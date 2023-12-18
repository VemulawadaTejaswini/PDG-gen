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

		for (int j = 0 ; j < N-1 ;) {
			int num = nums.get(j);
//			System.out.println(num);
			for (int k = j+1 ; k < N ;) {
//				System.out.println(k + ";" + num + ":" + nums.get(k));
				if(num == (nums.get(k))) {
					cnt++;
				}
				k++;
			}
			j++;
		}

//		System.out.println(cnt);

		System.out.println(cnt > 0 ? "No" : "Yes");

	}

}