import java.util.*;
public class Main {
	public static void main(String[] args){
		stoneMonument();
	}
	
	public static void stoneMonument() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long cur = 0;
		long pre = 0;
		for (int i=0; i<999; i++) {
			if ((cur - b) == (pre - a)) {
				System.out.println(cur-b);
				return;
			}
			pre = cur;
			cur += i;
		}
	}
}