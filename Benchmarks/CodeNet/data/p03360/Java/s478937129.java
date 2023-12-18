import java.util.*;

class Main {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

		int L = A + B + C;
		
    	int ans = 0;		
    	
    	if(A>B&&A>C){
    	ans =	L + (A * 2);
    	}else if(B>A&&B>C){
    	ans = L + (B * 2);
    	}else if(C>A&&C>B){
    	ans = L + (C * 2);	
    	}
    	System.out.println(ans);
    }
}