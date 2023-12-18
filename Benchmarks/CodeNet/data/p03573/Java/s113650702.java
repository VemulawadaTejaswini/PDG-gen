import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		//計算

		
		if (A == B && B != C){
			 System.out.println(C);	
		}else if (A == C && A != B){
			 System.out.println(B);
		}else if (B == C && B != A){
			System.out.println(A);
		}
	
	    
		
		
	}