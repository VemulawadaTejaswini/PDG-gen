import java.util.Scanner;

public class Main {

	public static int[] Fee = {200, 300};
	public static int Num_Classes = 9;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] className = new String[Num_Classes];
		int[][] visitors = new int[Num_Classes][2];
		for(int i = 0; i < Num_Classes; i++){
			className[i] = sc.next();
			visitors[i][0] = sc.nextInt();
			visitors[i][1] = sc.nextInt();
		}

		sc.close();

		int[][] data = new int[Num_Classes][2];
		for(int i = 0; i < Num_Classes; i++){
			data[i][0] = visitors[i][0] + visitors[i][1];
			data[i][1] = visitors[i][0] * Fee[0] + visitors[i][1] * Fee[1];
		}

		for(int i = 0; i < Num_Classes; i++){
			System.out.printf("%s %d %d\n", className[i], data[i][0], data[i][1]);
		}


	}

}