import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> m=new ArrayList<>();
		m.add(1);
		for(int x=6;x<=N;x*=6) m.add(x);
		for(int x=9;x<=N;x*=9) m.add(x);
		
		int[] a=new int[N+1];
		Arrays.fill(a, N+1);
		a[1]=1;
		int p=1;
		while(p<N){
			for(int x:m){
				if(p+x>N)continue;
				a[p+x]=Math.min(a[p]+1, a[p+x]);
			}
			p++;
		}
		
		System.out.println(a[N]);
	}

	public static int gcd(int a, int b) {
		return a%b==0 ? b : gcd(b,a%b);
	}
}
