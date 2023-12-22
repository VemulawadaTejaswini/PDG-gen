import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().mainrun();
	}

	Scanner scan;

	int N,K;
	private List<Integer> Digits;


	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();
		K = scan.nextInt();
		int max = -1;
		Digits = new LinkedList<>();

		for(int i = 0;i < N;i++) {
			int num = scan.nextInt();
			Digits.add(num);
			max = Math.max(max, num);
		}

		ListIterator<Integer> li;
		li = Digits.listIterator();

		if(N - K ==1) {
			System.out.println(max);
			return ;
		}

		while(K != 0) {
			int num1 = li.next();
			int num2 = li.next();

			li.previous();
			
			if(num1 < num2) {
				li.previous();
				li.remove();

				if(li.nextIndex() >= 1) {
					li.previous();
				}
				K--;
			}

			if(li.nextIndex() == Digits.size() -1) {
				while(K != 0) {
					li.remove();
					li.previous();
					K--;
				}
			}
		}

		Digits.forEach(System.out::print);

		System.out.println();

		scan.close();
	}

}

