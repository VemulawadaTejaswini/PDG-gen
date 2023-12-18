import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		if(c-a-b>0&&4*a*b<(long) Math.pow(c-a-b, 2)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		
	}
 
}