import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);

		int set_count = in.nextInt();
		int min = 1;
		int max = 1;
		int sum = 0;

		for(int i = 0; i < set_count; i++){
			int num = in.nextInt();
			min = Math.min(min, num);
			max = Math.max(max, num);
			sum += num;
		}
		System.out.println(min + " " + max + " " + sum);
	}

}

