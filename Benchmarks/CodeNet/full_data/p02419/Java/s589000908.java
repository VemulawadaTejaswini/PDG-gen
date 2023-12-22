import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		int sum = 0;

		while(true){
			String x = scanner.next();

			if(x.equals("END_OF_TEXT")){
				break;
			}

			if(x.toLowerCase().equals(w.toLowerCase())){
				sum++;
			}
		}

		System.out.println(sum);
	}
}