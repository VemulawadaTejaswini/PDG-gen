import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] numbers = num.split(" ");
		double N = Integer.parseInt(numbers[0]);
		double M = Integer.parseInt(numbers[1]);


		String num2 = scan.nextLine();
		String[] numbers2 = num2.split(" ");
//		int A1 = Integer.parseInt(numbers[0]);
//		int A2 = Integer.parseInt(numbers[1]);
//		int A3 = Integer.parseInt(numbers[2]);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<N; i++) {
			list.add(Integer.parseInt(numbers2[i]));
		}
		int count = 0;
		double sum = 0;
		for(int i = 0; i<N; i++) {
			sum=sum+list.get(i);
		}
		for(int i = 0; i<N; i++) {
			if(list.get(i)<(sum)/(4*M)) {

			}else {
				count++;
			}
		}
//		System.out.println(count);
		if(count>=M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
