import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

  int N = sc.nextInt();
  int K = sc.nextInt();
		
  final String hex = " fe ";
  final int dec = Integer.parseInt(hex, N);
  final int n = K;
  final String baseK = Integer.toString(dec);
  
  System.out.println(baseK.length);
  
	
	}
}