import java.util.Scanner;

class codeB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num=n;
		int sum = 0;
		while(n >= 1) {
			sum += n % 10;
			n /= 10;
		}
		
		if(num % sum == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}