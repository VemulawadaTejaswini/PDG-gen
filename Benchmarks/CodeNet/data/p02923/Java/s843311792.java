import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		int i=0;

		int count = 0;
		int count2 = 0;

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] H = new int[N];

		for(i = 0;i < N;i++) {
		H[i] = sc.nextInt();
		}

		for(int j = 0; j < N-1; j++) {
			for(int k = j; k < N-1; k++) {
				if(H[k] > H[k+1]) {
					count++;
				}else break;
			}
			H[j] = count;
			count = 0;
		}

		for(int j = 0; j < N-1 ; j++) {
			if(H[j] > count ) {
				count = H[j];
			}
		}

		System.out.println(count);
	}
}