import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		int num[] = new int[100010];
		for (int i = 0; i < N; i++) {
			num[list.get(i)]++;
		}

		int ans = 1;
		int cnt = 1;
		for (int j = 1; j < N-1; j++) {
			ans = Math.max(ans,num[j-1]+num[j]+num[j+1]);
		}
		System.out.println(ans);
	}
}
