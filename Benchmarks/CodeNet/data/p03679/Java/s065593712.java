import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if(b < a) {
			System.out.println("delicious");
		} else if(a+b <= x) {
			System.out.println("safe");
		} else {
			System.out.println("dangerous");
		}
		
	}
	
}