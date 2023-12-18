import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer input = new Integer(scanner.next());
		Integer count = 0;
		Integer data = 2;

		while(input >= data) {
			data = data*2;
			count ++ ;
		}


		System.out.println(data/2);

		scanner.close();
	}

}