import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public void run() throws Exception {
		//
		final int N;
		final int K;
		final int[] a;
		Scanner scan = new Scanner(System.in);
			N = scan.nextInt();
			K = scan.nextInt();
			a = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = scan.nextInt();
			}
			Arrays.sort(a);
		int anw=0;
		for(int i=N-K;i<N;i++){
			anw +=a[i];
		}

		System.out.println(anw);
	}
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    int findSumOfDigits(int n) {
    	  int sum = 0;
    	  while (n > 0) { // n が 0 になるまで
    	    sum += n % 10;
    	    n /= 10;
    	  }
    	  return sum;
    	}
}