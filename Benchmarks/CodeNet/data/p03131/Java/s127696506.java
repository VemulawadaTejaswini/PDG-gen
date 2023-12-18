import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int out = 0;
		if(b - a <= 2 || a >= k) {
			out = 1 + k;
			System.out.println(out);
		}else {
			int firstless = a - 1;
			k -= firstless;
			int splitnum = k/2;
			int addnum = b - a;
			out = splitnum * addnum + a;
			if((k - (a + 1)) % 2 == 1) {
				out += 1;
			}
			System.out.println(out);
		}
	}
	
}