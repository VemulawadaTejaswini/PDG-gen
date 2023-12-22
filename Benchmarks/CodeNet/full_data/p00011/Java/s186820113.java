import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int w,n;
	private Integer[] ans;


	private void mainrun() {
		scan = new Scanner(System.in);

		w = Integer.parseInt(scan.nextLine());
		n = Integer.parseInt(scan.nextLine());

		ans = new Integer[w];

		for(int i = 0;i < w;i++) {
			ans[i] = i + 1;
		}

		for(int i = 0;i < n;i++) {
			looprun();
		}

		Arrays.asList(ans).forEach(System.out::println);

		scan.close();
	}

	private void looprun() {
		String[] str = scan.nextLine().split(",");

		int a = Integer.parseInt(str[0]) - 1;
		int b = Integer.parseInt(str[1]) - 1;

		int tmp = ans[a];
		ans[a] = ans[b];
		ans[b] = tmp;

	}
}
