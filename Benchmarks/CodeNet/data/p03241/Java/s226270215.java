import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.close();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i <= (int)Math.sqrt(M); i++) {
			if(M % i == 0) {
				list.add(i);
			}
		}
		int max = 1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) <= M / N) {
				max = list.get(i);
			}
		}
		System.out.println(max);
	}
}