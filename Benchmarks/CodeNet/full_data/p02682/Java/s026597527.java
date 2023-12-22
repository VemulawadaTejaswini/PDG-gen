import java.util.*;
public class Main{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int res = a;
		if(k <= a + b)
			System.out.println(res);
		else {
			res -= (k - a - b);
			System.out.println(res); 
		}
    }
}