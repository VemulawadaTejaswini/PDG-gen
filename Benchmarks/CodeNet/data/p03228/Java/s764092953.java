import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		for(int i = 0; i < k; i++) {
			if(i % 2 == 0) {
				a /= 2;
				b += a;
			}else {
				b /= 2;
				a += b;
			}
		}
		System.out.print(a + " " + b);
	}
}