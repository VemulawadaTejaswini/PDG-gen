import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int M = scanner.nextInt();
		scanner.close();
		String sum = "";
		for (int i = 0; i < L; i++) {
			int value = A + B * i;
			sum += value;			
		}
		System.out.println(Integer.parseInt(sum)%M);
    }
}