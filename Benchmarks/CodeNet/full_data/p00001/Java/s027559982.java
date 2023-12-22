import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[10];
		for(int i = 0; i < 10; i++){
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		for(int i = 0; i < 3; i++)
			System.out.println(array[i]);
	}
}