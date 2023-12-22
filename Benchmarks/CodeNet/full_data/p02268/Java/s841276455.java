import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countA,countB,sum=0;
		countA = sc.nextInt();
		int[] s = new int[countA];
		for(int i=0; i<countA; i++) {
			s[i] = sc.nextInt();
		}
		countB = sc.nextInt();


		for(int i=0; i<countB; i++) {
			int tmp = sc.nextInt();
			if(Arrays.binarySearch(s, tmp) > -1)
				sum++;
		}
		System.out.println(sum);
	}
}



