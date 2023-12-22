import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong(),b=in.nextLong(),c=in.nextLong(),d=in.nextLong();
		
		long x= 1,y=1;
		long ans =1;
		if(a > 0 && b>0 && c>0 && d>0) {
		
			ans = a * b;
		}
		else if(c< 0 && d < 0) {
			ans = a * d;
		}
		
		else {
			ans = a * c;
		}
		
		
		System.out.println(ans);
		
	}

}
