import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] ary = new int[num];
		int sum = 0;
		for(int i=0; i<num; i++) {
			ary[i] = scan.nextInt();
			sum += ary[i];
		}
		scan.close();
		if(sum%10 != 0) {
			System.out.println(sum);
			return;
		}
		Arrays.sort(ary);
		for(int i=0; i<num; i++) {
			sum = sum-ary[i];
			if(sum%10 != 0) {
				System.out.println(sum);
				return;
			}
		}
		System.out.println(0);
	}

}