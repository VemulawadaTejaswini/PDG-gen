
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean reverseEven = true;
		String top = "";
		String bottom = "";
		String s = sc.next();
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int q1 = sc.nextInt();
			if(q1 == 1){
				reverseEven = !reverseEven;
			}else{
				int f = sc.nextInt();
				if(f == 1){
					if(reverseEven){
						top += sc.next();
					}else{
						bottom += sc.next();
					}
				}else{
					if(reverseEven){
						bottom += sc.next();
					}else{
						top += sc.next();
					}
				}
			}
		}
		String ans = new StringBuilder(top).reverse().toString() + s + bottom;
		if(! reverseEven){
			ans = new StringBuilder(ans).reverse().toString();
		}
		System.out.println(ans);
	}
}
