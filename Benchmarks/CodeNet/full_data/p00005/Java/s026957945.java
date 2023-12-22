
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while((str = sc.nextLine())!=null){
			String[] numStrs = str.split(" ");
			int a = Integer.parseInt(numStrs[0]);
			int b = Integer.parseInt(numStrs[1]);
			if(b>a){
				int w = a;
				a = b;
				b = w;
			}
			solve(a, b);
		}
	}

	public void solve(int a, int b) {
		int gcdRes = gcd(a, b);
		int lcmRes = lcm(a, b);
		
		System.out.println(gcdRes + " " + lcmRes);
	}
	
	private int gcd(int a, int b){
		if(a%b == 0)
			return b;
		
		return gcd(b, a%b);
	}
	
	private int lcm(int a, int b){
		if(a==2)
			return 2;
		
		int wb = b;
		
		int r = 1;
		for(int i=2;i*i<=a;i++){
			int aFact = 1;
			while(a%i==0){
				a = a/i;
				aFact*=i;
			}
			
			int bFact = 1;
			while(b%i==0){
				b = b/i;
				bFact*=i;
			}
			
			if(aFact>bFact)
				r *= (aFact/bFact);
		}
		return wb*r;
		
	}
	

}