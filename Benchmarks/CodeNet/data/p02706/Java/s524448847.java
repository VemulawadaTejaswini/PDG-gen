import java.util.*;

public class Main {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += s.nextInt();

		if (sum > m)
			System.out.println(-1);
		else
			System.out.println(m - sum);
}

}
