import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		
		int sum = 0;
		
		for(int i=a;i<=t+0.5;i+=a)
			sum += b;
	
		System.out.println(sum);
	}
}