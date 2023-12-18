import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong(), b=s.nextLong(), x=s.nextLong();
		
		long start=0, end=0;
		for (long i = a; i <= b; i++) {
			if (i%x == 0) {
				start = i / x;
				break;
			}
		}
		
		if (start != b) {
			for (long i = b; i >= a && i >start; i--) {
				if (i%x == 0) {
					end = i / x;
					break;
				}
			}
		}
		
		if (start==end) {
			if (start==0 && end ==0) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}else {
			System.out.println(end-start+1);
		}
				
		s.close();
	}
}