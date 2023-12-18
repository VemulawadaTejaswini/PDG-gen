import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int in = 0;
		int ans = 0;

		for(int i = 0;i < N;i++) {
			in = scan.nextInt();
			list.add(in);
			ans += in;
		}

		int M = scan.nextInt();
		ArrayList<Integer> ans_box = new ArrayList<Integer>();

		for(int i = 0;i < M;i++) {
			in = scan.nextInt();
			ans_box.add(ans + (scan.nextInt() - list.get(in - 1)));
		}

		for(int i = 0;i < M;i++) {
			System.out.println(ans_box.get(i));
		}
	}
}