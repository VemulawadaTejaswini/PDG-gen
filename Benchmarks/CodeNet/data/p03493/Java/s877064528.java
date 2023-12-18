import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = Integer.parseInt(s);
		int n = 0;
		for(int j = 1; j <= 100;j = 10 * j) {
			if((i / j) % 2 == 0) { 
				
			}else {
				n++;
			}
		}
		System.out.println(n);
	}
}