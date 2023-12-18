import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		long[]d=new long[m];
		long[]c=new long[m];
		long ans=-1;
		long sum=0;
		for(int i=0; i<m; i++){
			d[i]=sc.nextLong();
			c[i]=sc.nextLong();
			ans+=c[i];
			sum+=d[i]*c[i];
		}
		System.out.println(ans+(sum/9));
	}
}
