import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] P = new int[3];
		int i = 0;
		while(i < 3) {
			P[i] = scan.nextInt();
			i++;
		}
		if((P[0] == P[1]) && (P[1] == P[2])){
			System.out.println(-1);
			return;
		}
		
		int x=0,y=0,z=0;
		int count = 0;
		while(true){
			
			if((P[0]%2 != 0) || (P[1]%2 != 0) || (P[2]%2 != 0)){
				System.out.println(count);
				return;
			}
			x = P[0]/2;
			y = P[1]/2;
			z = P[2]/2;
			
			P[0] = 0;
			P[1] = 0;
			P[2] = 0;
			
			P[0] = y + z;
			P[1] = x + z;
			P[2] = x + y;
			
			count++;
			
			
			
			
		}
		
		
	}

}