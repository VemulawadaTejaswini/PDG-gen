import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Integer[] input = new Integer[6];		
		Scanner scan1 = new Scanner(System.in);
		while(scan1.hasNext()){
			for(int i=0; i<6; i++){
				input[i] = scan1.nextInt();
			}
			int tmp = input[3] / input[0];
			for(int i=0; i<3; i++){
				input[i+3] = input[i+3] - input[i] * tmp;
			}
			double y = input[5] / input[4];
			double x = (input[2] - (input[1] * y)) / input[0];
			double x_ans = new BigDecimal(x).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			double y_ans = new BigDecimal(y).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.printf("%.3f ",x_ans);
			System.out.printf("%.3f",y_ans);
			System.out.println("");
		}
	}
}