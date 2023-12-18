import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int temp = n;
		if(m % n == 0)
			System.out.println(m / n);
		else{
			while(m % temp != 0 || m / temp <= n)
				temp--;
			System.out.println(temp);
		}

	}

}