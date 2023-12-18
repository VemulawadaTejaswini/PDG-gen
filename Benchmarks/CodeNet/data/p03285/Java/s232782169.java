import java.util.*;
public class Main {
	public static boolean kaimono(int n) {
		for(int i = 0; i <= n/4; i++) {
			for(int j = 0; j <= n/7; j++) {
				if(n==(4*i)+(7*j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		if(kaimono(n)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
		
	}

}
