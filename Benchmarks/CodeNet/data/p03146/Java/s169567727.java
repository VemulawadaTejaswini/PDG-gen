
import java.util.Scanner;

public class Main {

	public static int func(int n) {
		int res=0;
		if(n%2==0) {
			res=n/2;
		}
		else if(n%2==1) {
			res=3*n+1;
		}
		return res;
	}

	public static void main(String[] args) {
		int ans=0;
		int []a=new int[1000000];
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		a[0]=s;
		for(int i=1;i<a.length;i++) {
			a[i]=func(a[i-1]);
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					ans=i+1;
					break;
				}
			}
			if(ans!=0)break;
		}
		System.out.println(ans);
		sc.close();
	}
}
