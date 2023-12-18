import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;
		
		for(int i = 1; i<=N; i++) {
			int x = sc.nextInt();
			min = Math.min(min, Integer.lowestOneBit(x));
		}
		
		System.out.println((int)(Math.log(min)/Math.log(2)));
	}
}
