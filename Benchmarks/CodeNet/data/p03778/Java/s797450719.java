import java.util.*;
public class Main {
	static boolean isIn(int a, int b, int w) {
		if(a <= b && b <= a + w) {
			return true;
		}
		else if(b <= a && a <= b + w) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int move = 0;
		if(!isIn(a, b, w)){
			if(a <= b) move = b - a - w;
			else move = a - b - w;
		}
		System.out.println(move);
	}
	

}
