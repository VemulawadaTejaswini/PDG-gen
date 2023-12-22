import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
m=sc.nextInt();
p=sc.nextInt();
hun=sc.nextInt();
for(o=0;o<hun+1;o++) {
	if(n<m) {
		if(m<p) {
		System.out.println("Yes");
		return;
		}
		if(m>p) {
			p=p*2;
			//System.out.println(p);
		}
	}
	if(n>m) {
		m=m*2;
		//System.out.println(m);
	} 
	
}
System.out.println("No");
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}