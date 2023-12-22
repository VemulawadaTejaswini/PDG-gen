import java.util.Scanner;

public class Main {
	static final int Big_Num = 1000000000;
	static int mul(int n,int h) {
		int ans = n;
		if(h==1)
			return ans;
		for(int i=0;i<h-1;i++) {
			ans *= n;
		}
		return ans;
	}
	
	static int f(String str,int n) {
		
		int[] an = new int[str.length()];
		int k = 0;
		for(int i=0;i<str.length();i++) {
			char s = str.charAt(i);
			if(Character.isDigit(s)) {
				an[k] = Integer.parseInt(String.valueOf(s));
				k++;
			}
		}
		
		int ans = 0;
		int kk = 0;
		for(int aa:an) {
			ans += mul(n,aa);
			kk++;
			if(kk==k)break;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int t = sc.nextInt();
			String str = sc.next();
			
			int ans = f(str,n);
			if(ans*t <= Big_Num && ans >0) 
				System.out.println(ans*t);
			else
				System.out.println("TLE");
	}
}
