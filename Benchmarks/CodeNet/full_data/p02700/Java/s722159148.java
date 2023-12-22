import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		long turn = 0;
		
		while(A >= 1 && C >= 1){
		    if(turn == 0){
		        C = C - B;
		        turn = 1;
		    }if(turn == 1){
		        A = A - D;
		        turn = 0;
		    }
		}
		
		if(C <= 0){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
      
	}
}