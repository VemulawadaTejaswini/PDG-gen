import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int []p= {};
		int max=0;
		int sum=0;
		int ans=0;
		
		n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			p[i]=sc.nextInt();
			
			if(max<p[i]) {
				max=p[i];
			}
			sum+=p[i];
		}
		ans=sum-max+(max/2);
		System.out.println(ans);
	}
}
