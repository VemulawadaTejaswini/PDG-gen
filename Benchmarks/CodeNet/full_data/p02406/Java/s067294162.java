
import java.util.Scanner;

public class D5 {
	public static void main(String[] args) {
		int i, n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print(" ");
		for(i = 3; i < n && n <= 10000; i++){
			if(n - i < 3 && i % 3 == 0)
				System.out.println(i);
			else if(i % 3 == 0)
				System.out.print(i + " ");
			else if(i % 10 == 3)
				System.out.print(i + " ");
			else if(i % 100 == 3)
				System.out.print(i + " ");
			else if(i % 1000 == 3)
				System.out.print(i + " ");
			else if(i >= 30 && i < 40)
				System.out.print(i + " ");
			else if(i >= 300 && i < 400)
				System.out.print(i + " ");
			else if(i >= 3000 && i < 4000)
				System.out.print(i + " ");
		}
	}
}