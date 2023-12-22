import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		int[] d = new int[K];
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < K; i++) {
			d[i] = Integer.parseInt(sc.next());
			for(int j = 0; j < d[i]; j++) {
				set.add(Integer.parseInt(sc.next()));
			}
		}
		for(int i = 0; i < N; i++) {
			list.add(i + 1);
		}
		//リストから抜く
		System.out.println(list.size() - set.size());
		sc.close();

	}

}