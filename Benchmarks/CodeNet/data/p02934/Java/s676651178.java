import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double t = 0;
		for(int i = 0; i < N; i++)
			t += (double)1/sc.nextInt();
		System.out.println(1/t);

	}

}
