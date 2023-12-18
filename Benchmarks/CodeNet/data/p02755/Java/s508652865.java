import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int ans = -1;
		
		
		for(int i = 0 ; i < 2000; i++) {
			if((int)(i *0.08) == a && (int)(i * 0.1) == b) {
				ans = i;
				break;
			}
			
		}
		
		System.out.println(ans);
		
	}
}