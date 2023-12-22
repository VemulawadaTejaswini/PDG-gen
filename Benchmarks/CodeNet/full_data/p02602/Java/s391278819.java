import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int ansCount = N - K;
		int tmp = K;
		for(int i = 0; i < ansCount; i++) {
			int checkA = list.get(i);
			int checkB = list.get(tmp);
			if(checkA < checkB) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			tmp++;
		}

	}

}