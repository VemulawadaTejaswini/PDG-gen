import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= N; i++) {
			sum += i;
			list.add(i);
			if(sum >= N) {
				break;
			}
		}
		for(int i : list) {
			if(i != sum - N) {
				System.out.println(i);
			}
		}
	}
}