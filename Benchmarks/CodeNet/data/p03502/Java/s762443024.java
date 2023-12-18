import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//入力ここから
		int N = sc.nextInt();
		int iniN = N;

		List<Integer> DList = new ArrayList<Integer>();

		while (N > 0) {
			int D = N % 10;
			DList.add(D);
			N = N / 10;
		}

		int tmp = 0;
		for (int i = 0; i < DList.size(); i++) {
			tmp = tmp + DList.get(i);
		}

		if (iniN % tmp == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}
}

