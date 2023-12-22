import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);


	public boolean isPrime(int n){
		if(n<2)return false;

		for(int i=2;i*i<=n;i++){
			if(n%2==0)return false;
		}
		return true;
	}

	public void run() {
		while (sc.hasNext()) {
			int val=sc.nextInt();
			int lessP=0;int greatP=0;
			for(int i=val-1;;i--){
				if(isPrime(i)){
					lessP=i;break;
				}
			}
			for(int i=val+1;;i++){
				if(isPrime(i)){
					greatP=i;break;
				}
			}
			ln(lessP+" "+greatP);
		}
	}


	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}