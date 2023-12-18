import java.util.Scanner;

public class Main {

	// first digit is 1
	private long getNum(long digit, long num) {
		num += 1;	// count number that is started 0
		long count = 0;
		long freq = 0x1L << digit;
		count += (num / freq) * (freq / 2);
		num = num % freq;
		num -= freq / 2;
		if (num > 0) {
			count += num;
		}
		return count % 2;
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		in.close();
		long max = Math.max(A, B);
		
		long digit = 1;
		long num = 0x1;
		
		String result = "";
		
		while(num <= max) {
			long nowRet = getNum(digit, A-1) + getNum(digit, B);
			nowRet = nowRet % 2;
			result = nowRet + result;
			digit++;
			num = num << 1;
		}
		if (result == "") {
			System.out.println(0);
		} else {
			System.out.println(Long.valueOf(result, 2));
		}
		 
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
