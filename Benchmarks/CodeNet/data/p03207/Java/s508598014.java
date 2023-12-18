import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] p = new int[N];
		
		for(int i=0;i<N;i++) {
			p[i]=sc.nextInt();
		}
		
		Arrays.sort(p);
		
		int sum=0;
		
		for(int i=0;i<N-1;i++) {
			sum+=p[i];
		}
		
		System.out.println(sum+p[N-1]/2);
		
		sc.close();
	}
}
