import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] T = new int[5];
		int[] AT = new int[5];
		int[] TAT = new int[5];
		
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			T[i] = sc.nextInt();
			if(T[i] % 10 != 0) {
				AT[i] = 10 - (T[i] % 10);
			} else {
				AT[i] = 0;
			}
			TAT[i] = T[i] + AT[i];
			if(max <= AT[i] ) {
				max = AT[i];
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += TAT[i];
		}
		
		sum -= max;
		
		System.out.println(sum);
		
	}
}
