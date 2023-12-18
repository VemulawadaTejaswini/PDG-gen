import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		for (int i=0;i<n;i++){
			a[i]=sc.nextLong();
			b[i]=sc.nextLong();
		}
		int c=0;
		for (int i=n-1;i>=0;i--){
			Long d=(a[i]+c)%b[i];
			if(d!=0&&d<b[i]){
				c+=b[i]-d;
			}
		}
		System.out.println(c);
	}
}