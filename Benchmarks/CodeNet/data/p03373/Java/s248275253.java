import static java.lang.System.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
		int total = 0;
		if (a+b > 2*c) { //ABピザを買う必要あり
			total += 2*c*(Math.min(x,y));
			if (x > y) {
				total += (x-y)*a;
			}
			else if (x < y) {
				total += (y-x)*b;
			}
			int total2 = 2*c*(Math.max(x,y));
			out.println(Math.min(total,total2));
		}
		else {
			total = a*x + b*y;
			out.println(total);
		}
	}
}