import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		int sum = 0;

		while(true){
			String x = scanner.next();

			if(x == "END_OF_TEXT"){
				break;
			}

			if(x == w){
				sum++;
			}
		}

		System.out.println(sum);
	}
}