
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class CodeForces {

		public static void main(String[] args){
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int n4 = n%10;
			n/=10;
			int n3 = n%10;
			n/=10;
			int n2 = n%10;
			n/= 10;
			
			if(n==n2 && n2 ==n3)
				System.out.println("Yes");
			else if(n2==n3 && n3==n4){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
	        
	    }
}

