import java.util.*;
public class Main{
	//A - Traveling Budget
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		    int A = scanner.nextInt(), B = scanner.nextInt();
		    int S = 0;
		    if(A <= B){
		      S += A; 
		    }
		    else{
		      S += B;
		    }
		    int C = scanner.nextInt(), D = scanner.nextInt();
		    if(C <= D){
		      S += C; 
		    }
		    else{
		      S += D;
		    }
		    System.out.println(S);
		
		
	}

}
