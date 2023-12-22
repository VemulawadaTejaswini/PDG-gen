import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=sc.nextInt();
		int ans=0;
		if(a>=k){
			ans+=k;
		}else if(a+b>=k){
			ans=a;
		}else if(a+b+c>=k){
			ans+=a;
			k-=a;
			k-=b;
			ans-=k;
		}
		System.out.println(ans);
	}
}