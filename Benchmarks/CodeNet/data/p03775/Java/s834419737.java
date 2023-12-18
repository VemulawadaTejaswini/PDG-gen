import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
		
			long n = sc.nextInt();
			double sqrtN = Math.sqrt(n);
			int min = String.valueOf(n).length();

			for(int i=1; i <= sqrtN; i++){
				if(n % i == 0) min = Math.min(min, String.valueOf(n / i).length());
			}
			System.out.println(min);
	}
}