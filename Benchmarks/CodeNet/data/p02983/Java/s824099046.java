import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int R = sc.nextInt();
		long min = Long.MAX_VALUE;

		L = L % 2019;
		R = R % 2019;
		if (L > R) {
			int tmp = L;
			L = R;
			R = tmp;
		}

		for (int i=L; i<R; i++){
			for (int j=i+1; j<=R; j++){
				min = Math.min(min, ((i * j) % 2019));
			}
		}
		System.out.println(min);
	}


}