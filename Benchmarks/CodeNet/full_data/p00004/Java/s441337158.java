import java.util.Scanner;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			int[] number = new int[6];
			double x,y;
			if(in.hasNextInt()==false){
				break;	
			}
			
			for(int i =0; i<6; i++){
				number[i] = in.nextInt();
			}
			y = ((number[2]*number[3]-number[5]*number[0])/(number[1]*number[3]-number[0]*number[4])) + 0.0;
			x = ((number[2]-number[1]*y)/number[0]) + 0.0;
			BigDecimal bi = new BigDecimal(String.valueOf(x));
			BigDecimal bi2 = new BigDecimal(String.valueOf(y));
			System.out.print(bi.setScale(3, BigDecimal.ROUND_HALF_UP)+" ");
			System.out.println(bi2.setScale(3, BigDecimal.ROUND_HALF_UP));
		}
		in.close();

	}
}