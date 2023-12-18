import java.util.*;
final class Solution{
	private static long solve(int a, int b, int c, int x, int y){
		long option1 = (a * x) + (b * y);
		long option2 = 0;
	if (x > y){
	   option2 = ((x - y) * a) + (Math.min(x, y) * c * 2);
	} else if (y > x){
	   option2 = ((y - x) * b) + (Math.min(x, y) * c * 2);
	} else {
	    option2 = (x * c * 2);
	}
	option2 = Math.min(option2, Math.max(x, y) * c * 2);
	return Math.min(option1, option2);
	}
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   int c = sc.nextInt();
	   int x = sc.nextInt();
	   int y = sc.nextInt();
	   System.out.println(solve(a, b, c, x, y));
	}
}