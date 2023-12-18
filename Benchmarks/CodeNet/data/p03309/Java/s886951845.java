import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] inputs = new int[n];
		for(int i = 0; i < n; i++) {
			inputs[i] = scan.nextInt();
		}
		
		int seed = -1;
		if(inputs[0] > inputs[n - 1]) {
			for(int i = n - 1; i >= 0; i--) {
				seed = inputs[i] - i - 1;
				if(seed >= 0) break;
			}
		} else {
			seed = inputs[n - 1] - n;
		}
		
	
		
		int sum = 0, fAbs = 0;
		for(int i = 0; i < n; i++) {
			fAbs = inputs[i] - seed - i - 1;
			if(fAbs < 0) fAbs *= -1;
			sum += fAbs;
		}
		
		System.out.println(sum);
		scan.close();
	}
}
