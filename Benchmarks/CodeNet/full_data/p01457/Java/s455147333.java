import java.util.Scanner;
public class Main {
	int Q;
	long r,l;
	public void solve() {
		Scanner cin = new Scanner(System.in);
		Q = cin.nextInt();
		r = 0;
		l = 0;
		for(int i = 0;i < Q;i++){
			int p = cin.nextInt();
			String c = cin.next();
			long n = cin.nextLong();
			
			if(c.equals("(")){
				r += n;
			}else{
				l += n;
			}
			
			if(r == l){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
 
	public static void main(String[] args) {
		new Main().solve();
	}
}