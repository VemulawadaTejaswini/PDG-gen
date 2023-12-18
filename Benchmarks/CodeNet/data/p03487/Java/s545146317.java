import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int[] t = new int[s];
		for (int i = 0; i < s; i++) t[i] = sc.nextInt();
		
		Arrays.sort(t);
		int nowNum = 1;
		int count = 0;
		int ansCount = 0;
		for (int i = 0; i <= t.length; i++) {
			if (nowNum != t[i]) {
				nowNum = t[i];
				count = 0;
			}
			if (count++ > t[i]) {
				ansCount++;
			}
		}
		
		System.out.println(ansCount);
	}

}