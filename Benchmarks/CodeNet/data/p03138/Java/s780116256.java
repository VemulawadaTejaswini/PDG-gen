import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N
		long K = sc.nextLong(); //K
		List<Long> A = new ArrayList<>();
		long f = 0;
		for(int n =0 ; n < N; n++) {
			A.add(sc.nextLong());
		}
		for(int k =0; k < K; k++) {
			long ftmp = 0;
			for(int n =0 ; n < N; n++) {
				ftmp += k^A.get(n);
			}
			if(f < ftmp) {
				f = ftmp;
			}
		}

		System.out.println(f);
	}

}