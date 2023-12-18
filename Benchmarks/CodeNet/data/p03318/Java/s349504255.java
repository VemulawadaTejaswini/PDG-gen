import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long k = in.nextLong();
		long target = 1;
		for(long i=0;i<k;i++) {
			while(true) {
				boolean found = false;
				long test = target+1;
				while(!found && test<target*10) {
					if((double)target/getDigitSum(target) > (double)test/getDigitSum(test)) {
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
	
	public static long getDigit(long num) {
		long digit = 0;
		while(num>0) {
			digit++;
			num /= 10;
		}
		return digit;
	}
}
