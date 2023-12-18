import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;
		int ans = 0;
		
		for(int i=0; i<N; i++){
			ans = sc.nextInt();
			sum += sc.nextInt();
			if(sum>=K) break;
		}
		
		System.out.println(ans);
		return;
	}
}