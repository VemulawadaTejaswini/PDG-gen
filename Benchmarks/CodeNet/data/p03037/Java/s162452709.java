import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 127
//C	Prison
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		List<Integer> Ls = new ArrayList<>();
		List<Integer> Rs = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			Ls.add(sc.nextInt());
			Rs.add(sc.nextInt());
			sc.nextLine();
		}

		sc.close();

		int min = 0;
		int max = N;
		for (int i = 0; i < M; i++) {
			min = Math.max(min, Ls.get(i));
			max = Math.min(max, Rs.get(i));
		}

		System.out.println(max - min + 1);

	}
}
