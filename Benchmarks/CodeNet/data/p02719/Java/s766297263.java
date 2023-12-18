import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int n, k;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();

		if(n >= k){
			int reminder = n % k;
			if(k - reminder < reminder){
				System.out.println(k - reminder);
			}
			else{
				System.out.println(reminder);
			}
		}
		else{
			if(k % n == 0){
				System.out.println(n);
			}
			else{
				System.out.println(k-n);
			}
		}
		
	}
}