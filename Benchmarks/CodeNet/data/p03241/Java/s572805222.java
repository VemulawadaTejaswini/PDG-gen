import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static LinkedList<Integer> fact(int n){
		int tn = n;
		LinkedList<Integer> ans = new LinkedList<Integer>();
		if(ip(n)) {
			ans.add(n);
			return ans;
		}
		for(int i = 2; i <= tn; i++) {
			if(n == 1) break;
			if(ip(i)) {
				while(n % i == 0) {
					ans.add(i);
					n /= i;
				}
			}
		}
		return ans;
	}
    static boolean ip(long x){
        if(x==1) return false;
        for(long i=2;i*i<=x;i++) if(x%i==0) return false;
        return true;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		LinkedList<Integer> yaku = new LinkedList<Integer>();
		for(int i = 1; i * i <= M; i++) {
			if(M % i == 0) {
				yaku.add(i);
				yaku.add(M / i);
			}
		}
		int ans = 0;
		for(int y : yaku) {
			if(M / y >= N) ans = Math.max(ans, y);
		}
		System.out.println(ans);
	}
}
