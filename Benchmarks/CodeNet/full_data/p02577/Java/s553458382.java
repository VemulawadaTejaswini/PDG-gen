import java.util.*;
public class Main {
	public static long sumDigits(long n) {
        long sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long i = sumDigits(N);
		long s = 0;
		
		for(s = 0; s <= 10; s++) {
			i = sumDigits(i);
			if(i < 10) {
				if(i == 9) {
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
				break;
			}
		}
	}
}