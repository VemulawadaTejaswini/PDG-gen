
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		System.out.println((N-1)*(M-1));
		in.close();
	}
}