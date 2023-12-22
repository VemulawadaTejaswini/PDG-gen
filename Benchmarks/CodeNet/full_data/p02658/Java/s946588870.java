import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigDecimal sum = new BigDecimal("1");
		BigDecimal big[] = new BigDecimal[n];
		BigDecimal over = new BigDecimal("1000000000000000000");
		int result = 1;
		for(int i = 0; i < n; i++) {
			big[i] = sc.nextBigDecimal();
		}
	
		for(int i = 0; i < n-1; i++){
	        for(int j = 1; j < n; j++){
	            if(big[i].compareTo(big[j]) == 1){
	                BigDecimal temp = big[j];
	                big[j] = big[i];
	                big[i] = temp;
	            }
	        }
	    }
		for(int i = 0; i < n; i++) {
			sum = sum.multiply(big[i]);
			result = over.compareTo(sum);
			break;
		}
		if(result==-1) {
			System.out.println(result);
		}else {
			System.out.println(sum);
		}
	}
}