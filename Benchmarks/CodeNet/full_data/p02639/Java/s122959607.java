import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];

		for (int i=0; i<5; i++) {
			int c = sc.nextInt();
			nums[i] = c;
		}


		int index=1;
		for (int i=0; i<5; i++) {
			if (nums[i]==0) {
				index = i+1;
				break;
			}
		}
		System.out.println(index);
	}

}