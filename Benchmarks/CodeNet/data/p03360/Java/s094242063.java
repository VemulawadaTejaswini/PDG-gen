import java.util.*;

public class Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=sc.nextInt();
		int max=a;
		int ans=0;

		if(a<b && b>c) max=b;
		else if(a<c && b<c) max=c;

		for(int i=0;i<k;i++){
			ans+=2*max;
		}

		ans=ans+(a+b+c-max);

		System.out.println(ans);
	}
}