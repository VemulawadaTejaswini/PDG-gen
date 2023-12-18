import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		//int N = in.nextInt();
		int K = in.nextInt();
		int a = (int)Math.sqrt(K);
		
		System.out.println(a*a);
		
		
		in.close();
	}
}
