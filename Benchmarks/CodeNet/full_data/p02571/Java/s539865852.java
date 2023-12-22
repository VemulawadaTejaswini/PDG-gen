import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op,ta;
	Scanner sc = new Scanner(System.in);
	public void solve() {
		op=sc.next();
		ta=sc.next();
		n=ta.length();
		for(o=0;o<ta.length();o++){
			
			if(op.indexOf(ta.substring(o))>=0) {
			System.out.println(o);
			
				return;
			}
			if(op.indexOf(ta.substring(0,n-o))>=0) {
					System.out.println(o);
					
					return;
				}
		//	System.out.println(ta.substring(o));
		}
System.out.println(n);
	}
	public static void main(String[] args) {
		new Main().solve();
	}
}