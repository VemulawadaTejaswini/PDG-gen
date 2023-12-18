import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		int min = 0, max = 0;
		if(a == b) System.out.println(0);
		else if(a < b) {
			min = a; max = b;
		}
		else if(b < a) {
			min = b; max = a;
		}
		if(min + W < max) System.out.println(max - (min + W));
		else if(min + W >= max) System.out.println(0);
	}
}
