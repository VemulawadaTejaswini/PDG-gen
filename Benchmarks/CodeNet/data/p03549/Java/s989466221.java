import java.util.*;
public class Main {
	public static void main(String[] args) {
		C();
	}
	
	public static void A() {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.compareTo(s2) < 0) System.out.println("<");
		else if(s1.compareTo(s2) == 0) System.out.println("=");
		else System.out.println(">");
	}
	
	public static void B() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		if(X<Y || X<Z) {
			System.out.println(0);
			return;
		}
		X -= Z;
		System.out.println(X/(Y+Z));
	}
	
	public static void C() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		int ret = (int) ((M*1900+(N-M)*100)*Math.pow(2, M));
		System.out.println(ret);
	}
}
