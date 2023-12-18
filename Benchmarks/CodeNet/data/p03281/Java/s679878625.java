import java.util.*;

public class Main {
	static int get(int a) {
		for(int i = 3;i <= a / 2;i += 2) {
			if(a % i == 0) {
				return get(a / i) + 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int m = 0;
		if(a >= 105)m ++;
		for(int i = 107;i <= a;i += 2) {
			if(get(i) == 3)m ++;
		}
		System.out.println(m);
	}
}
