import java.util.Scanner;

public class Main {
	/*
	 * idea : 
	 * 	suppose output_m1 is a snukeNumber
	 *  first plus 1 and check whether 10^numberOfTrailNine()*S(output)≥output
	 *  if true then output
	 *  else plus 10^i and verify again until find next value;
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int k=1;
		long output = 0;
		labelB:
		while(k<=K) {
			labelA:
			while(output < Math.pow(10, 15)){
				long temp = output;
				for(int i = 0; i < 15 ; i++) {
					temp += (long) Math.pow(10, i);
					if(Math.pow(10, countNineNumber(temp))*digitSum(temp) >= temp) {
						output = temp;
						System.out.println(output);
						k++;
						break labelA;
					}else {
						temp = output;
					}
				}
			}
			if(output > Math.pow(10, 15)) {
				break;
			}
		}

	}

	private static int countNineNumber(long n) {
		int count = 0;
		while(n!=0) {
			if(n%10==9) {
				count ++;
			}else {
				break;
			}
			n /= 10;
		}
		return count;
	}
	public static int digitSum(long n) {
		int sum = 0;
		while(n != 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

}