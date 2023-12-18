import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		long target = 1;
		for(int i=0;i<k;i++) {
			while(true) {
				boolean found = false;
				long test = target+1;
				while(!found && test<target*2) {
					if(target/getDigitSum(target) > test/getDigitSum(test)) {
						found = true;
						break;
					}
					test++;
				}
				if(found) {
					target++;
				}else {
					System.out.println(target);
					target++;
					break;
				}
			}
		}

	}
	
	public static long getDigitSum(long num) {
		long sum = 0;
		while(num>0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	
	public static int getDigit(long num) {
		int digit = 0;
		while(num>0) {
			num/=10;
			digit++;
		}
		return digit;
	}

}
