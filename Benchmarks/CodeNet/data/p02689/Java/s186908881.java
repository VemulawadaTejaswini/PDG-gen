import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		ArrayList<Integer> ansList = new ArrayList<>(list);
		for(int i = 0; i < M; i++) {
			int left = list.get(Integer.parseInt(sc.next()) - 1);
			int right = list.get(Integer.parseInt(sc.next()) - 1);
			int check = Math.min(left, right);
			if(ansList.contains(check)) {
				ansList.remove(ansList.indexOf(check));
			}
		}
		sc.close();
		System.out.println(ansList.size());
	}
}
