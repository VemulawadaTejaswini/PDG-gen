import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.next());
		ArrayList<Integer> list = new ArrayList<Integer>(N);
		int comfort = 0;
		int right = 0;
		int left = 0;
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(scanner.next()));
		}
		Collections.sort(list);
		Collections.reverse(list);
		right = list.get(0);
		left = list.get(1);
		comfort += right;
		for(int i=2;i<N;i++) {
			if(right > left) {
				comfort += left;
				right = list.get(i);
			}else {
				comfort += right;
				left = list.get(i);
			}
		}
		System.out.println(comfort);
		scanner.close();
	}
}