
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		long X = Long.parseLong(sc.next());
		long Y = Long.parseLong(sc.next());
		int ans = 0;
		while(X<=Y){
			X = X*2;
			ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}
}
