import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int p = 2019;
		
		int min1 = Math.max(l&p, r%p);
		int min2 = Math.max(l&p, r%p);
		int a ;
		
		for(int i = l ; i <= r ; i++) {
			a = i % p;
			if(min1 >= a) {
				min1 = Math.min(min1, a);
			}
			if(min1 < a) {
				if(min2 >= a)
					min2 = Math.min(a, min2);
			}
			if(min1 == 0 || min2 == 0)
				break;
		}
		System.out.println((min1 * min2)% p);
	}

}
