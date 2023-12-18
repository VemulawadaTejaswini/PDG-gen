/**
 * 
 */
package One_out_of_Three;
  
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
    	int B = scanner.nextInt();
    	int C = scanner.nextInt();
		if(A==B){
			System.out.println(C);
	    }
    	if(B==C){
    		System.out.println(A);
    	}
		if(A==C){
    		System.out.println(B);
    	}
		
      
      
	}

}

