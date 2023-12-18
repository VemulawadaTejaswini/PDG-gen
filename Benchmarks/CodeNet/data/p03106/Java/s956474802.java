
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int i = 100;
		while(count < k) {
			System.out.print(i + " : " + (a%i)+ "," + (b%i) + " : ");
			if(a%i == 0 && b%i == 0) {
				count++;
			}
			System.out.println(count);
			i--;
		}
		System.out.println(i+1);
		sc.close();
	}
}
