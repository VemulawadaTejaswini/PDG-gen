import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
o=7;
while(o!=0) {
	kl=kl+1;
	if(o%n==0) {
		System.out.println(kl);
		return;
	}
	o=o*10;
	o=o+7;	
	if(n%2==0||n%5==0) {
		break;
	}
}
System.out.println("-1");
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}