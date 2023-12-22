import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int ans = 0;
		while(k > 0) {
			
			if(a >0) {
				a--;
				ans++;
			}else if(b > 0) {
				b--;
			}else {
				ans--;
			}
			
			k--;
		}
		
		
		System.out.println(ans);
	 }

}
