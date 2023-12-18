import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		if(m % n == 0)
			System.out.println(m / n);
		else{
			while(m % n != 0)
				n--;
			System.out.println(n);
		}

	}

}