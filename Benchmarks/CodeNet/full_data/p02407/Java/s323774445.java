import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] age){
		int g = new Scanner(System.in).nextInt();
		int i = 0;
		String input = new Scanner(System.in).nextLine();
		String[] reinput = input.split(" ");
		StringBuffer br = new StringBuffer();


		Arrays.sort(reinput, Comparator.reverseOrder());

		for( i=0 ; i<g ; i++ ){
			br.append(reinput[i]);
			if( i==g-1 ) break;
			br.append(" ");
		}
		System.out.println(br);
	}
}