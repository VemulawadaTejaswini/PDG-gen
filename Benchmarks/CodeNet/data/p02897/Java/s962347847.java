import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		
		if(N%2 == 0) System.out.println((double)(N/2)/N);
		else System.out.println((double)(N/2+1)/N);

	}

}