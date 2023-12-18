import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());

		double diff = Double.MAX_VALUE;
		int num = -1;

		for (int i=0; i<N; i++){
			int h = Integer.parseInt(sc.next());
			double h_diff = Math.abs((T - h * 0.006) - A);

			if (h_diff < diff){
				diff = h_diff;
				num = i;
			}
		}
		System.out.println(num+1);
	}
}