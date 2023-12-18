
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int ans = 0;
		for(int i=0;i<M;i++) {
			if(M%N==0) {
				ans = M/N;
				break;
			}
			N++;
		}
		
		System.out.println(ans);
	}
	
}
