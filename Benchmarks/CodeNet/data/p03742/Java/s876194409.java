import java.util.*;

public class Main {
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		System.out.println(Math.abs(X-Y)<=1 ? "Brown" : "Alice");
		
		sc.close();
	}
}

