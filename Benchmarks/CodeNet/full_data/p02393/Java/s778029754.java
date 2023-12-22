import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if ((a < b) && (b < c)){System.out.println(System.out.printf("%d %d %d\n", a, b, c));}
		if ((a < b) && (b > c)){System.out.println(System.out.printf("%d %d %d\n", a, c, b));}
		if ((b < a) && (a < c)){System.out.println(System.out.printf("%d %d %d\n", b, a, c));}
		if ((a < b) && (c < a)){System.out.println(System.out.printf("%d %d %d\n", b, c, a));}
		if ((c < a) && (a < b)){System.out.println(System.out.printf("%d %d %d\n", c, a, b));}
		if ((c < b) && (b < a)){System.out.println(System.out.printf("%d %d %d\n", c, b, a));}

	}
}