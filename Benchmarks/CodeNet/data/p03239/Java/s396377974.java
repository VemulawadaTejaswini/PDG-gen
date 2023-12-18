import java.util.Arrays;
import java.util.Scanner;






// B
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());

		int[] array = new int[N];
		Arrays.fill(array, 9999);

		for(int i = 0; i < N; i++) {
			int Ci = Integer.parseInt(sc.next());
			int Ti = Integer.parseInt(sc.next());
			if(Ti <= T) {
				array[i] = Ci;
			}
		}
		Arrays.sort(array);
		if(array[0] == 9999) {
			System.out.println("TLE");
		}else {
			System.out.println(array[0]);
		}


	}
}