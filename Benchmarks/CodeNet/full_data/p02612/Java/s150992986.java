import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
while(true) {
	n=n-1000;
	if(n<=0) {
		if(n==0) {
		System.out.println(n);
		break;
	}else {
		System.out.println(n*-1);
		break;
	}
	}
}
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}