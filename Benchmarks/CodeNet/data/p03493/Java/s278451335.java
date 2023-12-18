import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next().substring(0, 1));
		int b = Integer.parseInt(sc.next().substring(1, 2));
		int c = Integer.parseInt(sc.next().substring(2, 3));
		
		System.out.println(a+b+c);
	}
}
