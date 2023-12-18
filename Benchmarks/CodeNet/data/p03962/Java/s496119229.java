import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		int N=sc.nextInt();
		int K=sc.nextInt();
		
		int a=(int)Math.pow(K-1, N-1);
		System.out.println(K*a);	
}
}