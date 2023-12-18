import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//In
		int n = scan.nextInt();
		boolean result = false;
		
		//Process Out
		for(int i=1;i<10;i++) {
			if(n%i == 0 && n/i<10) {
				result = true;
				break;
			}
		}
		
		if(result == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	
	
	}

}
