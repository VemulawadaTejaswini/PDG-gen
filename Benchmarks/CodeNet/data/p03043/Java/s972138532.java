import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
	}
	
	public static void A(Scanner sc) {
		int n = sc.nextInt();
		int k = sc.nextInt()-1;
		String s = sc.next();
		System.out.println(s.substring(0,k)+Character.toLowerCase(s.charAt(k))+s.substring(k+1,n));
	}
	
	public static void B(Scanner sc) {
		String s = sc.next();
		if((Integer.valueOf(s.substring(0,2))==0 || Integer.valueOf(s.substring(0,2))>=13) && Integer.valueOf(s.substring(2,4))<=12 && Integer.valueOf(s.substring(2,4))>=1) System.out.println("YYMM");
		else if((Integer.valueOf(s.substring(2,4))>=13 ||Integer.valueOf(s.substring(2,4))==0)&& Integer.valueOf(s.substring(0,2))<=12 && Integer.valueOf(s.substring(0,2))>=1) System.out.println("MMYY");
		else if(Integer.valueOf(s.substring(2,4))<=12 && Integer.valueOf(s.substring(0,2))<=12 && Integer.valueOf(s.substring(2,4))>=1 && Integer.valueOf(s.substring(0,2))>=1) System.out.println("AMBIGUOUS");
		else System.out.println("NA");
	}
	
	public static int findminl(int x, int k) {
		int ret = 1;
		int pro = x*2;
		while(pro<k) {
			ret++;
			pro*=2;
		}
		return ret;
	}
	
	public static void C(Scanner sc) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		double ret = (n>=k)? (n-k+1)/(double)n:0.0;
		for(int i=1;i<=Math.min(k-1,n);i++) ret+=((1.0/Math.pow(2.0, findminl(i,k)))*(1.0/n));
		System.out.println(ret);
	}
}