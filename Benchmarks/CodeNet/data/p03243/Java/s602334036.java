import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = n; i < 1000; i++) {
			if(i==111 || i == 222 || i== 333 || i == 444 || i == 555 || i == 666 || i == 777 || i == 888 || i == 999) {
				System.out.println(i);
				return;
			}
			
			
		}
		
		
	}

}
