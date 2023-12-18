import java.util.Arrays;
import java.util.Scanner;

public class Main {
static int gcd(int a,int b) {
	if(a%b==0) return b;
	else return gcd(b,a%b);
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] l = new int[n];
		for(int i=0;i<n;i++) {
			l[i]=sc.nextInt();
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(i==0) ans= gcd(l[0],l[1]);
			else ans=gcd(ans,l[i]);
		}
System.out.println(ans);
	}
}
