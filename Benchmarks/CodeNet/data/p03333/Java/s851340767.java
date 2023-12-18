import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();

		int l[]=new int[n];
		int r[]=new int[n];
		
		for(int i=0;i<n;i++) {
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		Arrays.sort(l);
		Arrays.sort(r);
		long ans=0;
		for(int i=0;i<n/2;i++) {
			ans+=2*l[n-i-1];
			ans-=2*r[i];
			
		}
		if(n%2==1) {
			int c[]=new int[5];
			c[0]=l[n/2];
			c[1]=r[n/2-1];
			c[2]=-r[n/2];
			c[3]=-l[n/2+1];
			c[4]=0;
			Arrays.sort(c);
			ans+=2*c[4];
		}
		System.out.println(ans);
		
	}
	

}


