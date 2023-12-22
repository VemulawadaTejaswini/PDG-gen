import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		double[] data = new double[6];
		double solve1 , a , b , x , y;
		int solve2 , num1 , num2 , hosei;
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			for ( int i = 0; i < 6; i++ ) data[i] = sc.nextInt();
			double big = Math.max(data[0], data[3]);
			double small = Math.min(data[0], data[3]);
			if ( big % small == 0 ) {
				num1 = 0; num2 = 3;
			} else {
				num1 = 1; num2 = 4;
			}
			solve1 = Math.abs( Math.max(data[num1],data[num2]) / Math.min(data[num1], data[num2]) );
			if ( data[num1] * data[num2] < 0 ) {
				hosei = 1;
			} else
				hosei = -1;
			if ( Math.min(data[num1],data[num2]) == data[num1] )
				solve2 = 0;
			else
				solve2 = 3;
			data[solve2] = data[solve2] * solve1 * hosei;
			data[solve2+1] = data[solve2+1] * solve1 * hosei;
			data[solve2+2] = data[solve2+2] * solve1 * hosei;
			if ( num1 == 0 ) {
				a = data[1] + data[4];
				b = data[2] + data[5];
				y = b / a;
				x = (data[2] - ( data[1] * y ) ) / data[0];
			} else {
				a = data[0] + data[3];
				b = data[2] + data[5];
				x = b / a;
				y = (data[2] - ( data[0] * x )) / data[1];
			}
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}