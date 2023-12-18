import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
	int N=sc.nextInt();
	String S =sc.next();
	int Q=sc.nextInt();
	int mojiretu[]=new int[100];
	int cnt=0;
	String bb;int type;int a;
	int b;
	for(int i=0;i<Q;i++) {
		type=sc.nextInt();
		a=sc.nextInt();
		if(type==1) {
			bb=sc.next();
			StringBuilder sb = new StringBuilder(S);
			sb.setCharAt(a-1,bb.charAt(0));
			S=sb.toString();
		}else if(type==2) {
			b=sc.nextInt();
			
			//a~bまでで何文字種類があるか
			//charat(a-1)~charat(b-1)
			
			for(int g=a-1;g<=b-1;g++) {
				if(mojiretu[S.charAt(g)]==0) {
					mojiretu[S.charAt(g)]++;
					cnt++;
				}
				
			}
			Arrays.fill(mojiretu, 0);
			p(cnt);
			cnt=0;
		}
	}
	
	}
}