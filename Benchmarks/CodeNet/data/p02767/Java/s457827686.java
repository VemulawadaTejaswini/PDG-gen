import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> coor = new ArrayList<Integer>();

		while(sc.hasNext()) {
			coor.add(sc.nextInt());
		}

		int sum = 0;
		int answer = 99 * 100;

		for(int i = 1; i <= 100; i++) {

			for(Integer j: coor) {
					sum += (j - i)*(j - i);
			}
			if(sum <= answer) {
				answer = sum;
			}
		}

		System.out.println(answer);
	}
}
