import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int min,max;
		if(b <= c) {
			System.out.println(0);
		}else {
			if(a < c) {
				min = c;
			}else {
				min = a;
			}
			if(b < d) {
				max = b;
			}else {
				max = d;
			}
			System.out.println(max-min);
		}
	}

}