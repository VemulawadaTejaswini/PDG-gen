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
	
	for(int i=0;i<Q;i++) {
		int type=sc.nextInt();
		int a=sc.nextInt();
		if(type==1) {
			String b=sc.next();
			StringBuilder sb = new StringBuilder(S);
			sb.setCharAt(a-1,b.charAt(0));
			S=sb.toString();
		}else if(type==2) {
			int b=sc.nextInt();
			int cnt=0;
			//a~bまでで何文字種類があるか
			//charat(a-1)~charat(b-1)
			int mojiretu[]=new int[1000];
			for(int g=a-1;g<=b-1;g++) {
				if(mojiretu[S.charAt(g)]==0) {
					mojiretu[S.charAt(g)]++;
					cnt++;
				}
				
			}
			p(cnt);
			
		}
	}
	
	}
}