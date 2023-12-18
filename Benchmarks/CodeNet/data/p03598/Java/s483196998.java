import java.util.Arrays;
import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] array = new int[n];
		int[] result = new int[n];

		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
		}

		for(int i=0;i<n;i++) {
			int a = Robot(array[i], 0);
			int b = Robot(array[i], k);
			if(a>b) {
				result[i] = b;
			}else {
				result[i] = a;
			}
		}

		System.out.println(Arrays.stream(result).sum());


	}

	public static int Robot(int a, int i) {
		int r = (a-i)*2;
		if(r<0) {
			r = r*(-1);
		}
		return r;

	}

}
