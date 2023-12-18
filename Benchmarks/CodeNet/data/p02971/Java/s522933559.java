import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int input;
		int first = 0, second = 0;
		int first_i = 0;
		
		for(int i = 0; i < N; i++) {
			input = Integer.parseInt(sc.next());
			if (first < input) {
				second = first;
				first = input;
				first_i = i;
				
			} else if (second < input) {
				second = input;
			}
		}
		
		for (int i = 0; i < N; i++ ) {
			if (i == first_i) {
				System.out.println(second);
			} else {
				System.out.println(first);
			}
		}
				 
		sc.close();
	}

}
