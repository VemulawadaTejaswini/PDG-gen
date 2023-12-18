import java.util.Arrays;
import java.util.Scanner;
public class Main {

	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static int lcm (int a, int b) {return a*b/gcd(a,b);}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		int a[]=new int[b];
		for(int i=0;i<b;i++) {
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		int co=0;
		int ans=0;
		for(int i=1;i<b;i++) {
			if(a[i]==a[i-1]) {
				co++;
			}
			else {
				if(co%2==0) {
					ans++;
				}
				co=0;
			}
		}
		if(co%2==0) {
			ans++;
		}
		System.out.println(ans);
	}

}
