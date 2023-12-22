import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] input = new int[10];

		Scanner sc = new Scanner(System.in);
		int ix = 0;
		
		do{
			input[ix] = Integer.parseInt(sc.nextLine());
			ix++;
		}while(sc.hasNext());

		for(int i = 0; i < input.length - 1; i++) {
			for(int j = i + 1; j <= input.length - 1;) {
				if(input[i] < input[j]) {
					int tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}

		for(int i = 0; i < 3; i++) {
			System.out.println(input[i]);
		}
	}
}