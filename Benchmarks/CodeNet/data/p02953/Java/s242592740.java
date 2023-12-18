import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]H = new int[N];

		for (int i=0; i<N; i++){
			H[i] = sc.nextInt();
		}

		int[] H1 = H.clone();
		for (int i=1; i<N; i++){
			if (H1[i-1] > H1[i]){
				H1[i-1] = H1[i-1] -1;
				break;
			}
		}
		int []H2 = H1.clone();
		Arrays.sort(H1);
		if (Arrays.equals(H1, H2)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}