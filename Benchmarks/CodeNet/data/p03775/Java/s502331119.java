import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long a = 1;
		long b = n;
		int min = String.valueOf(n).length();
		if(Math.sqrt(n) - (int)(Math.sqrt(n)) == 0) {
		    min = String.valueOf(Math.sqrt(n)).length();
		}else {
    		for(int i=2; i<=Math.sqrt(n); i++) {
    		    if(b % i == 0) {
    		        a *= i;
    		        b /= i;
    		        if(min > Math.max(String.valueOf(a).length(), String.valueOf(b).length())) {
    		            min = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
    		        }
    		        i--;
    		    }
    		}
		}
		
		System.out.println(min);
	}
}