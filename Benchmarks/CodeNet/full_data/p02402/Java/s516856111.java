import java.util.Arrays;
import java.util.Scanner;

public class Main4d {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);

		int set_count = in.nextInt();
		
		int[] ary = new int[set_count];
		long sum = 0;
		int i = 0;

		for(i = 0; i < set_count; i++){
			ary[i] = in.nextInt();
			sum += ary[i];
		}
		Arrays.sort(ary);
		System.out.println(ary[0] + " " + ary[i-1] + " " + sum);

		
	}

}

