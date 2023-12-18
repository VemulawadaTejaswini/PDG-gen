import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int out = 0;
		if(b >= c || c - b == 1 || b >= a) {
			out = 1 + a;
			System.out.println(out);
		}else {
			int firstless = b - 1;
			a -= firstless;
			int splitnum = a/2;
			int addnum = c - b;
			out = splitnum * addnum + b;
			if(a%2 == 1) {
				out += 1;
			}
			System.out.println(out);
		}
	}
	
}