import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		int[] d = new int[K];
		int cookie[][] = new int[K][K];
		for(int i = 0; i < K; i++) {
			d[i] = Integer.parseInt(sc.next());
			for(int j = 0; j < d[i]; j++) {
				cookie[i][j] = Integer.parseInt(sc.next());
			}
		}
		for(int i = 0; i < N; i++) {
			list.add(i + 1);
		}
		for(int i = 0; i < K; i++) {
			for(int j = 0; j < K; j++) {
				int tmp = cookie[i][j];
				if(list.contains(tmp)) {
					list.remove(list.indexOf(tmp));
				}
			}
		}

		//リストから抜く
		System.out.println(list.size());
		sc.close();

	}

}