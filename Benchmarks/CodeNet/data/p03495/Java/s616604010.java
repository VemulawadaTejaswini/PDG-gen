
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[200100];
		int [] kinds = new int[200100];
		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
			kinds[d[i]] ++;
		}
		Arrays.sort(kinds);
		int result = 0;
		for(int i = 0; i < kinds.length - k; i++) {
			result += kinds[i];
		}
		System.out.println(result);
	}

}
