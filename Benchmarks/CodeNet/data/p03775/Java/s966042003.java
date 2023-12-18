import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long a = 1;
		long b = n;
		int min = String.valueOf(n).length();
		for(int i=2; i<=Math.sqrt(n); i++) {
		    if(n % i == 0) {
		        a *= i;
		        b /= i;
		        if(min > Math.max(String.valueOf(a).length(), String.valueOf(b).length())) {
		            min = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
		        }
		    }
		}
		
		System.out.println(min);
	}
}