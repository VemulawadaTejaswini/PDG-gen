//package abc044a;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, k, x, y, ans;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		
		ans = k * x + (n - k) * y;
		System.out.println(ans);

	}

}
