import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String S = scan.next();

		List<String> A = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			A.add(String.valueOf(S.charAt(i)));
		}

		int count = 1;
		for(int i = 0; i < N -1; i++) {
			if(!(A.get(i).equals(A.get(i+1)))) {
				//System.out.println(A.get(i)+"と"+A.get(i + 1)+"が違う");
				count++;
			}
		}

		System.out.println(count);
	}
}