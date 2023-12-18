import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> X = new ArrayList<>();
		for(int i=0;i<N;i++) {
			X.add(sc.nextInt());
		}

		for(int i=0;i<N;i++) {
			List<Integer> temp = new ArrayList<>(X);
			temp.remove(i);
			Collections.sort(temp);
			System.out.println(temp.get(N/2 - 1));
		}
	}
}
