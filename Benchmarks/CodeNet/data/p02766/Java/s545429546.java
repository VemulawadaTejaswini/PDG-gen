import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		String sn = Integer.toString(N,K);
		System.out.println(sn.length());


	}
}