import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int V[] = {1, 5, 10, 50, 100, 500};
		Scanner sr = new Scanner(System.in);


		while(true) {

			int count = sr.nextInt();

			if(count == 0) break;


			int change = 1000 - count;
			int sum = 0;
			for(int i=5; i >= 0; i--) {
				int k = change / V[i];
				change -= k * V[i];
				sum += k;
			}

			System.out.println(sum);
		}

		sr.close();

	}

}
