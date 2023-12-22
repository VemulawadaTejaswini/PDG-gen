import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
 if(n>=1800) {
	System.out.println("1");
}else if(n>=1600) {
	System.out.println("2");
}else if(n>=1400) {
	System.out.println("3");
}else if(n>=1200) {
	System.out.println("4");
}else if(n>=1000) {
	System.out.println("5");
}else if(n>=800) {
	System.out.println("6");
}else if(n>=600) {
	System.out.println("7");
}else {
	System.out.println("8");
}
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}