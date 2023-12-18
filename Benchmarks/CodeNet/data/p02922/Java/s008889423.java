import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int count = 0;
		int sum = 1;
		do {
			sum += a - 1;
			count++;
		}while(b > sum);
		
		System.out.println(count);

	}

}
