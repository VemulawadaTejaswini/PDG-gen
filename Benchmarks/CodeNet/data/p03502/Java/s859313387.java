import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn = n;
		int sum = 0;
		
		for(int i = 0; n >= 1; i ++) {
			sum += (n % 10);
			n = n /10;
		}
		if(nn % sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
