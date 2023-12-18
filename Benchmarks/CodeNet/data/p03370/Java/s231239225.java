import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int array[] = new int[N];
		int msum = 0;
		int mmin = 100000;

		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
			msum += array[i];
			if(mmin > array[i]) {
				mmin = array[i];
			}else {
				mmin = mmin;
			}
		}
		System.out.println((X-msum)/mmin + N);
	}

}
