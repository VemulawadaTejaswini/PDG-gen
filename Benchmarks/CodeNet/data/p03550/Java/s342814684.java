import java.util.*;
public class Main {
	public static void main(String[] args) {
		D();
	}
	
	public static void A() {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.compareTo(s2) < 0) System.out.println("<");
		else if(s1.compareTo(s2) == 0) System.out.println("=");
		else System.out.println(">");
	}
	
	public static void B() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		if(X<Y || X<Z) {
			System.out.println(0);
			return;
		}
		X -= Z;
		System.out.println(X/(Y+Z));
	}
	
	public static void C() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		int ret = (int) ((M*1900+(N-M)*100)*Math.pow(2, M));
		System.out.println(ret);
	}
	
	//必ず、最後のカードはひく
	//X,yそれぞれがひく場合を考えうr
	public static void D() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Z = sc.nextInt();
		int W = sc.nextInt();
		if(N==1) {
			System.out.println(Math.abs(W-sc.nextInt()));
			return;
		}
		for(int i=0;i<N-2;i++) {
			sc.nextInt();
		}
		int lastm = sc.nextInt();
		int last = sc.nextInt();
		sc.close();
		int cand1 = Math.abs(lastm-last);
		int cand2 = Math.abs(last- W);
		System.out.println(cand1>cand2? cand1 : cand2);
	}
}