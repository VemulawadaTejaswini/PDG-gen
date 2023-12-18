import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		String string = String.valueOf(N);
		for(int i = 0; i < string.length(); i++) 
		{
			sum += Integer.parseInt( string.substring(i,i+1) ) ;
		}
		if( N % sum == 0)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}
