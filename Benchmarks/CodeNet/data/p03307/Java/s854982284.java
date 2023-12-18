import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n % 2 == 1)n *= 2;
		System.out.println(n);
	}
}
