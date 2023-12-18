import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 124
//B	Great Ocean View
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Integer> H_List = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			H_List.add(sc.nextInt());
		}

		sc.close();

		int ans = 0;
		int max = 0;
		for (Integer H : H_List) {
			if (H >= max) {
				ans++;
				max = H;
			}
		}
		System.out.print(ans);
	}
}
