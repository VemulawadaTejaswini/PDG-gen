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
	int mojiretu[]=new int[26];
	String bb;
	int type,a,b,cnt=0;
	StringBuilder sb = new StringBuilder(S);
	for(int i=0;i<Q;i++) {
		type=sc.nextInt();
		a=sc.nextInt();
		if(type==1) {
			sb.setCharAt(a-1,sc.next().charAt(0));
		}else{
			b=sc.nextInt();
			for(int g=a-1;g<=b-1;g++) {
				if(mojiretu[sb.charAt(g)-97]==0) {
					mojiretu[sb.charAt(g)-97]++;
					cnt++;
				}
				if(cnt==26) {
					break;
				}
			}
			Arrays.fill(mojiretu, 0);
			System.out.println(cnt);
			cnt=0;
			}
	}
	
	}
}