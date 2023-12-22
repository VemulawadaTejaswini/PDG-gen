import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		
		int d = A*7+B;
		int day = C/d*7, r = C%d;
		int i=0;
		while (r>0 && i<7) {
			r-=A;
			i++;
		}
		
		day+=i;
		
		System.out.println(day);
	}

}

