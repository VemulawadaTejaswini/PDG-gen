import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);



		int number = scanner.nextInt();

		int[] array = new int[number];


		for(int i=0; i<array.length; i++){
			array[i] = scanner.nextInt();
		}

	

		for (int i = array.length - 1; i >= 1; i--) {
			System.out.print(array[i] + " ");

		}
		System.out.println(array[0]);

	}
}