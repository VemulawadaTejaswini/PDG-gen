import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int[] b = new int[n];
		int max = 0;
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			b[i] = sc.nextInt();
			if(a>max)
				max = a;
		}
		
		Arrays.sort(b);
		
		System.out.println(solve(n, h, max, b));
	}
	static int solve(int n, int h, int max, int[] b){
		int sum = 0, c = 0;
		for(int i=n-1;i>=0;i--){
			if(b[i]>=max){
				sum+=b[i];
				c++;
			}
			if(sum>=h)
				return c;
		}
		return c+(int)Math.ceil((double)(h-sum)/max);
	}
}