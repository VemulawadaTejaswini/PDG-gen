import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int X=sc.nextInt();
		int cat;
		int dog = a + b - X;
		cat = a + b - dog;
		if (cat == X) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}