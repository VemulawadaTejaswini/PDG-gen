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
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int left = list.get(a - 1);
			int right = list.get(b - 1);

			if(left < right) {
				if(ansList.contains(left)) {
					ansList.remove(ansList.indexOf(left));
				}
			}else if(left > right) {
				if(ansList.contains(right)) {
					ansList.remove(ansList.indexOf(right));
				}
			}else {
				if(ansList.contains(left)) {
					ansList.remove(ansList.indexOf(left));
				}
				if(ansList.contains(right)) {
					ansList.remove(ansList.indexOf(right));
				}
			}
		}
		sc.close();
		System.out.println(ansList.size());
	}
}