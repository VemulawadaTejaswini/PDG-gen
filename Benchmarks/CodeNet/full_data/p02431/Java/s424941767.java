import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
			for (int i = 0; i < q; i++) {


				switch (Integer.parseInt(sc.next())) {
				case 0:
					A.add(Integer.parseInt(sc.next()));
					break;
				case 1:
					System.out.println(A.get(Integer.parseInt(sc.next())));
					break;
				case 2:
					A.remove(A.size() - 1);
					break;
				}
 			}
		sc.close();
	}
}

