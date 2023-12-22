import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int N;
	private List<String> A;

	int cnt = 0;

	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();
		A = new ArrayList<>();
		for(int i = 0;i < N ; i++) {
			A.add(scan.next() + " ");
		}

		bobbleSort();

		for(String num: A) {
			System.out.print(num);
		}

		System.out.println(cnt);

	}

	private void bobbleSort() {
		boolean flag = true;

		while(flag) {
			flag = false;
			for(int j = N - 1;j > 0;j--) {
				if(Integer.parseInt(A.get(j).trim()) < Integer.parseInt(A.get(j -1).trim())) {
					String tmp = A.get(j);
					A.set(j, A.get(j-1));
					A.set(j-1, tmp);

					cnt++;
					flag = true;

				}
			}

		}

		A.set(A.size() - 1, A.get(A.size() - 1).trim() + "\n");
	}
}
