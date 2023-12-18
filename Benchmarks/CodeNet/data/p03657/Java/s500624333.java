import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		boolean flag = false;
		
		if(a % 3 == 0) {
			flag = true;
		}else if(b % 3 == 0) {
			flag = true;
		}else if(a+b % 3 == 0) {
			flag = true;
		}
		
		if(flag) {
			System.out.println("Possible");
		}else {
			System.out.println("Impossible");
		}
		
	}

}
