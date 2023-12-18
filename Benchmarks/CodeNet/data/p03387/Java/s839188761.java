import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] abc = new int[3];
		Arrays.setAll(abc, i -> sc.nextInt());
		Arrays.sort(abc);
		
		int cnt = 0;
		for (int i = 0; i < 2; i++) {
			int dif = abc[2] - abc[i];
			int quo = dif / 2;
			cnt += quo;
			abc[i] += 2 * quo;
		}
		
		Arrays.sort(abc);
		for (int i = 0; i < 3; i++) {
			abc[2 - i] -= abc[0];
		}
		
		for (int i : abc) {
			cnt += i;
		}
		
		System.out.println(cnt);
	}	
}
