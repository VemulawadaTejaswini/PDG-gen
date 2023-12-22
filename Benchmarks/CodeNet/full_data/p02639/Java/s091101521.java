import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			int a = scan.nextInt();
			if(a==0) {
				System.out.println(i);
				System.exit(0);
			}
		}
		
	}	
}
 
