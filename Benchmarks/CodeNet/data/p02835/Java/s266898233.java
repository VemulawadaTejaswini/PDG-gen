import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();
		sc.close();
		int a = A1 + A2 + A3;
		if (a < 22) {
			System.out.println("win");
		} else {
			System.out.println("bust");
		}
	}
}