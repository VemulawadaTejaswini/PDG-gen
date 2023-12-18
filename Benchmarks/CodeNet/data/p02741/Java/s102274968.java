
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		String num = "1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51";
		String [] numbers = num.split(",");
		ArrayList<String> numList= new ArrayList<>();
		for(String number:numbers) {
			numList.add(number);
		}

		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();

		System.out.println(numList.get(K-1));
	}
}