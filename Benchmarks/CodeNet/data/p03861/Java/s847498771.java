import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong(), b=s.nextLong(), x=s.nextLong();
		
		long start=0, end=0, ans=0;
		if (a%x==0) {
			start = a;
		}else {
			start = (x - a%x)+a;
		}
		end = b - (b%x);
		
		if (start<=b && end>=a) {
			start /= x;
			end /= x;
			ans = end-start+1;
		}
		
		System.out.println(ans);
		s.close();
	}
}