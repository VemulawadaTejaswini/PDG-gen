import java.util.Arrays;
import java.util.Scanner;

public class Main {

	final static int INPUT_COUNT = 2;

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int num[] = new int[INPUT_COUNT+1];

		for(int i=0;i<=INPUT_COUNT;i++){
			num[i] = scan.nextInt();
		}

		Arrays.sort(num);

		System.out.println(num[0] + " " + num[1] + " " + num[2]);

		scan.close();

	}
}