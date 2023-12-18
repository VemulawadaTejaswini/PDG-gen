import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a % 2 == 0) {
			System.out.println(a);
		}else if (a == 1) {
			System.out.println(2);
		}else{
			System.out.println(a*2);
		}
	}
}
