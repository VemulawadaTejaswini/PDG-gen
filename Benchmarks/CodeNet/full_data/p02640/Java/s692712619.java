import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int k = (4*n-m)/(4-2);
		int t = n -m;
		//System.out.println(k);
		if(k>0 && k+t <= n) {
			System.out.println("Yes");

		} else {
			System.out.println("No");

		}

		//String s = sc.next();
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		
		//for(int i = 0; i < ; i++)

		//System.out.println("Yes");
		//System.out.println("No");
		

	}
}
