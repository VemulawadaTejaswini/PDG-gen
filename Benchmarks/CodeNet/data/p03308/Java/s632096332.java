import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int[] num = new int[N];
		int max = 0;
		int min = 0;
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			min = num[0];
			if ( max < num[i]) {
				max = num[i];
			}
			if ( min > num[i]) {
				min = num[i];
			}
		}
		int result = max - min;
		System.out.println(result);
	}
}
