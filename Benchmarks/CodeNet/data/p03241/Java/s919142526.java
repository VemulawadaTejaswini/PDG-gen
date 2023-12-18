import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		if(n > m / 2)
			System.out.println(1);
		else{
			while(m % n != 0)
				n++;
			System.out.println(m / n);
		}
			
	}

}