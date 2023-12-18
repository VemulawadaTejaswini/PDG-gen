import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String a = scan.nextLine();
		String[] number = a.split(" ");
		int N = Integer.parseInt(number[0]);
		int K = Integer.parseInt(number[1]);
		ArrayList<Integer> sunuke = new ArrayList<>();
		for(int i = 0; i<N; i++) {
			sunuke.add(0);
		}

		for(int j = 0; j<K; j++) {
			@SuppressWarnings("resource")
			Scanner p = new Scanner(System.in);
			int d = Integer.parseInt(p.nextLine());

			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			String num = s.nextLine();
			String[] numbers = num.split(" ");
			for(int k = 0; k<d; k++) {
				int Q = Integer.parseInt(numbers[k]);
				//Q番目のす抜けくん(Q-1の番数のList)
				sunuke.set(Q-1, 1);
			}
		}
		int count = 0;
		for(int l = 0; l<N; l++) {
			if(sunuke.get(l)==0) {
				count++;
			}
		}

		System.out.println(count);
	}
}
