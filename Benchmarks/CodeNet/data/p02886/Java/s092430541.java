import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		int [] a = new int[n];
		int sum=0;
		for(int i = 0;i < n; i++) {
			a[i] = stdIn.nextInt();
			sum += a[i];
		}
		System.out.println(sum);
		

	}

}
