import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long []a=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		long min=a[0];
		long max=a[n-1];
		long ans=0;long stk=99999999;
		while(stk!=0) {
			stk=max%min;
			if(stk==0) {ans=min;break;}
			max=min;
			min=stk;
		}
		System.out.println(ans);
	}
}
