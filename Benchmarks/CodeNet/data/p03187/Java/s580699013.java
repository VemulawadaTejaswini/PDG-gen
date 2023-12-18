import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);

			int L = scanner.nextInt();
			int N = scanner.nextInt();

			List<Integer> X = new ArrayList<>();

			int answer = 0;
			int tmp = 0;
			int hu = 1;

			for (int i = 0; i < N; i++) {
				X.add(scanner.nextInt());
			}

			while (X.size() > 0) {
				if ((X.get(0) - (tmp * hu)) > ((L - X.get(X.size() - 1)) + (tmp * hu))) {
					answer += X.get(0) - (tmp * hu);
					tmp = X.get(0);
					X.remove(0);
					hu = 1;
				} else {
					answer += (L - X.get(X.size() - 1)) + (tmp * hu);
					tmp = L - X.get(X.size() - 1);
					X.remove(X.size() - 1);
					hu = -1;
				}
			}
			System.out.println(answer);

			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
		}
	}

}
