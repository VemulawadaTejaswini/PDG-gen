import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int max = 0;
		int floor = 0;


		for (int i = 1;i<=n ;i++ ) {
			floor = ((a*i)/b)-(a*(i/b));
			max = Math.max(max,floor);
		}
		System.out.println(max);


	}
}
