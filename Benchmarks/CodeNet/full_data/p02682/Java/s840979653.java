import java.util.*;
public class Main{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long k = sc.nextInt();
		long res = a;
		if(k <= a + b)
			System.out.println(res);
		else {
			res -= (k - a - b);
			System.out.println(res); 
		}
    }
}