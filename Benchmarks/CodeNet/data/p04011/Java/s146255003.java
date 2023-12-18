
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		if(n>k){
			 System.out.println((k*x)+((n-k)*y));
		}else {
			 System.out.println(k*x);
		}
		
	}
}
