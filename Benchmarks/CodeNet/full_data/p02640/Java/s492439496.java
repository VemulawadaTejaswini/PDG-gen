import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		int flag=0;
		for(int i=0;i<=x;i++) {
			if(i*2+(x-i)*4==y) {
				System.out.println("Yes");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("No");
		}
	}
}