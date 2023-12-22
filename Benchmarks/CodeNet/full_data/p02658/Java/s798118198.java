import java.math.BigDecimal;
import java.util.Scanner;

public class Main  {
	

	public static  void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int soe =0;
	int N = sc.nextInt();
	BigDecimal[] A = new BigDecimal [N];	
	BigDecimal kai = BigDecimal.valueOf(1);
	BigDecimal ban = BigDecimal.valueOf(1000000000000000000L);
		
		while(soe != N) {
			A[soe] = sc.nextBigDecimal();
		
			kai = kai.multiply(A[soe]);
			soe++;
			
		}
		
		
		
		
		 if(kai.compareTo(ban) == 0 || kai.compareTo(ban) == -1){
			
			System.out.println(kai);
		}else{
			System.out.println(-1);
		} 
		
			
	}
}
