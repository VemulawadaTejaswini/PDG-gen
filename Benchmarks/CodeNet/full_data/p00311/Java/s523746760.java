import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h1 = s.nextInt();
		int h2 = s.nextInt();
		int k1 = s.nextInt();
		int k2 = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		int h = 0;
		int k = 0;
		String ans;
		
		h = h1 * a + h2 * b + (h1 / 10) * c + (h2 / 20) * d;
		k = k1 * a + k2 * b + (k1 / 10) * c + (k2 / 20) * d;
		
		if(h>k){
			ans = "hiroshi";
		}else if(h<k){
			ans = "kenjiro";
		}else{
			ans = "even";
		}
		
		System.out.println(ans);
		
		
	}
}