import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
		int C = 0;
	    if(A >= 13){
			C = B;
	    	if(A > 5 && A < 13 ){
			C = B / 2;
		       if(A <= 5){
			C = 0;
		}
	    }
	    }
			
	    System.out.println(C);
	}
}
