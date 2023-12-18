import java.util.Scanner;

class Main{
	public static void main(String args[]){
		double n, k;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextDouble();
		k = scanner.nextDouble();

		if(n >= k){
			double reminder = n % k;
			if(k - reminder < reminder){
				System.out.println((int) (k - reminder));
			}
			else{
				System.out.println((int) reminder);
			}
		}
		else{
			if(k % n == 0){
				System.out.println((int) n);
			}
			else{
				System.out.println((int) (k-n));
			}
		}
		
	}
}