import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			double a = Math.pow(sc.nextInt(),2);
			double b = Math.pow(sc.nextInt(),2);
			double c = Math.pow(sc.nextInt(),2);
			if (a+b==c || a+c==b || b+c==a) {System.out.println("Yes");}
			else {System.out.println("No");}
		}
	}
}
