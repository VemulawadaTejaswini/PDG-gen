import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int sum = A;
		int count = 1;
		
		if(A >= B) {
			System.out.println(count);
		}
		else {
			while(sum < B) {
				sum += A-1;
				count++;
			}
			System.out.println(count);
		}
	}

}
