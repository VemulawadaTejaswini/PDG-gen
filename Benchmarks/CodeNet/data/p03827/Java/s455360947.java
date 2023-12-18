import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int[] count = new int[N+1];
		count[0] = 0;
		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='I') {
				count[i+1] = count[i]+1;
			}else {
				count[i+1] = count[i]-1;
			}
		}
		Arrays.parallelSort(count);
		System.out.println(count[N]);


	}
	public static int sample(int n) {
		return n;
	}

}
