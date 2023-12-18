import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int tempN = N;
		int fct = 0;
		
		while(tempN > 0) {
			fct += tempN%10;
			tempN /= 10;
		}
		
		if(N%fct == 0) System.out.println("Yes");
		else System.out.println("No");
	}

}
