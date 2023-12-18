
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum = 0;
		int index = 0;
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		while(true) {
			index = a[index] - 1;
			sum++;
			if(index == 0) {
				sum = -1;
				break;
			} else if(index == 1) {
				break;
			}
		}
		System.out.println(sum);
		scan.close();
	}

}
