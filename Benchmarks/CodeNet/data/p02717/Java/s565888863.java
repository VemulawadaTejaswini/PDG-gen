import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		String input = scanner.nextLine();
		scanner.close();
		
		String[] arrStr = (input.split(" ",0));
		
		int A, B, C;
		
		int[] arrInt = new int[3];
		int i = 0;
		for (String str : arrStr) {
			arrInt[i] = Integer.parseInt(str);
			i++;
		}
		
		A = arrInt[0];
		B = arrInt[1];
		C = arrInt[2];
		
		int tmp;
		tmp = A;
		A = B;
		B = tmp;
		tmp = A;
		A = C;
		C = tmp;
		
		System.out.println(A + " " + B + " " + C);
	}
}
