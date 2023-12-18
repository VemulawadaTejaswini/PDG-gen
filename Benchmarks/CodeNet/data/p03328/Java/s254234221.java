import java.util.*;
public class Main {
	public static void main(String[] args){
		stoneMonument();
	}
	
	public static void stoneMonument() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cur = 0;
		int pre = 0;
		for (int i=1; i<1000; i++) {
			if ((cur - b) >= 0 && (cur - b) == (pre - a)) {
				System.out.println(cur-b);
				return;
			}
			pre = cur;
			cur += i;
		}
	}
}