import java.util.Scanner;

public class Main {
	
	public static int GCD(int A,int B) {
		
		int ancer = 0;
		
		while(A%B != 0) {
			
			ancer = A % B;
			
			A = B;
			B = ancer;
			
		}
		
		return ancer;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int X = sc.nextInt();
    	
    	int Y = sc.nextInt();
    	
    	int a = 0;
    	
    	if(X > Y) {
    		a = GCD(X,Y);
    	}else if(Y > X){
    		a = GCD(Y,X);
    	}else {
    		a = X;
    	}
    	
    	System.out.println(a);
    }
}
