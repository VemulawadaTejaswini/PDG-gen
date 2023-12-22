import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
	
		Integer[] num = new Integer[5];
		for(int i = 0; i < num.length; i++) {
			
			num[i] = stdin.nextInt();
			
		}
	
		Arrays.sort(num, Comparator.reverseOrder());
		System.out.println(Arrays.toString(num));
		
	}

}