import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int N=in.nextInt();
		int[]a=new int[N];
		int c=0;
		for (int i = 0; i < N; i++) {
			a[i]=in.nextInt();
			if(a[0]!=a[i]) {
				c++;
			}
		}
		if(c==0) {
			System.out.println(0);
		}else {
			Arrays.sort(a);
			int num=(a[N-1]+a[N-2])/2;
			
			int sum=0;
			for (int i = 0; i < a.length; i++) {
				sum=sum+((a[i]-num)*(a[i]-num));
			}
			System.out.println(sum);
		}
		
	}
}