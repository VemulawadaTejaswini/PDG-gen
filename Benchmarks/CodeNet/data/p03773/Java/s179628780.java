//package abc057a;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, ans = 0;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		ans = a + b;
		if(ans > 24) ans -= 24;
		System.out.println(ans);

	}

}
