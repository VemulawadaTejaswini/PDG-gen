import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int[] d=new int[m];
		int[] c=new int[m];
		int ans=-1;
		long sum=0;
		for(int i=0; i<m; i++){
			d[i]=sc.nextInt();
			c[i]=sc.nextInt();
			ans+=c[i];
			sum+=d[i]*c[i];
		}
		System.out.println(ans+sum/10);
	}
}
