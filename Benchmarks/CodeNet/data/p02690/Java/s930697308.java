import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		long x = sc.nextLong();
		for(long a = 0; a <= x;a++) {
			for(long b =  -x; b <= 0;b++) {
				long temp = (int) (Math.pow(a, 5)-Math.pow(b, 5));
				if(temp == x) {
					System.out.println(a + " " + b);
					return;
				}
			}
		}
 
 
 
 
	}
 
}