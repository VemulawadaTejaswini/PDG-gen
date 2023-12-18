
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h  = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		long ans = h;
		if(w % 2 == 0) {
			ans *= w/2;
		}
		else {
			ans *=(long)(w-1)/2;
			if(h % 2 == 0) {
				ans += (long)h/2;
			}
			else {
				ans += (long)(h+1)/2;
			}
		}
		System.out.println(ans);
	}
}
