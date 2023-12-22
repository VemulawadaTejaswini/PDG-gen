import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println((Y%2==0 && X*2<=Y && Y<=X*4)? "Yes" : "No");

		sc.close();
	}
}
