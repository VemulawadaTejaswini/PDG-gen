import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sumA = 0;
		int sumB = 0;
		int AJudge = -1;
		int BJudge = 0;
		int N = scan.nextInt();
		Long[] a = new Long[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
		}
		Arrays.sort(a, Collections.reverseOrder());
		sumA += a[0];
		for(int i = 1; i < N; i++) {
			if(AJudge != -1) {
				sumA += a[i];
				AJudge++;
			} else if(BJudge != -1){
				sumB += a[i];
				BJudge++;
			}
			if(AJudge == 2) {
				AJudge = -1;
				BJudge = 0;
			} else if(BJudge == 2){
				AJudge = 0;
				BJudge = -1;
			}
		}
		System.out.println((int)Math.abs(sumA - sumB));
		scan.close();

	}

}
