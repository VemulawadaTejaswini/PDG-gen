import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long point[][] = new long[3][2];
		point[0][0] = 0;
		point[0][1] = 0;
		point[1][0] = 0;
		point[2][1] = 0;
		long tmp = 1;
		long tmpS = s;
		long max = (long)Math.pow(10, 9);
		for(long i = 1; i * i <= s; i += 2) {
			if(tmpS % i == 0) {
				tmp *= i;
				tmpS /= i;
				if(tmp <= max && tmpS <= max) {
					break;
				}
			}
		}
		point[1][1] = tmp;
		point[2][0] = tmpS;
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 2; j ++) {
				System.out.print(point[i][j]+" ");
			}
		}
		System.out.println();
	}
}