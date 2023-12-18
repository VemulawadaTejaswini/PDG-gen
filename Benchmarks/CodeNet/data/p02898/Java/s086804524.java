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

		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			int high = list.get(i);
			if(high >= K) {
				count++;
			}
		}
		System.out.println(count);
	}

}
