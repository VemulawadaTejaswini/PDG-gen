//D
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i = 0; i < 10000; i++) {
			Random rand = new Random();
			int a = rand.nextInt(50);
			int b = rand.nextInt(50) - 10000;
			int a_tmp = a * a * a * a * a;
			int b_tmp = b * b * b * b * b;
			if (a_tmp == b_tmp) {
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				break;
			}
		}
	}
}