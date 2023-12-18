import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		sc = null;
		int c = Math.max(a, b);
		if(a==b) System.out.println(a*2);
		else System.out.println(c*2-1);
	}
}