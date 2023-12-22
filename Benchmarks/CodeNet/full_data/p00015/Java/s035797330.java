import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal num1,num2,result;
		
		
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++){
			num1 = sc.nextBigDecimal();
			num2 = sc.nextBigDecimal();
				result = num1.add(num2);
					if(String.valueOf(result).length() >= 80){
						System.out.println("overflow");
					} else {
						System.out.println(result);
					}
		}
	}
}