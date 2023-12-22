import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true){
			Long m = scan.nextLong();
			Long n = scan.nextLong();
			Long g = gcd(m, n);
			
			System.out.println(g+" "+(m*n/g));
		}
		
	}
	
	private static Long gcd(Long a, Long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
}