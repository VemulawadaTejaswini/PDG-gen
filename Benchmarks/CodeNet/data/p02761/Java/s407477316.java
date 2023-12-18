import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] s=new int[M+1];
		int[] c=new int[M+1];
		
		for(int i=0;i!=M;i++) {
			s[i]=0;
			c[i]=0;
		}
		for(int i=1;i<=M;i++) {
			int si=sc.nextInt();//3
			int ci=sc.nextInt();//2
			
			if(s[si]!=0) {
				if(c[si]!=ci) {
					p("-1");
				}
			}else {
				s[si]++;
				c[si]=ci;
			}
			
			
		}
		int tmp=1;
		int answer=0;//c[ans]
		for(int ans=1;ans<=N;ans++) {
			tmp=1;
		for(int i=N-ans+1;i>1;i--) {	
			tmp=10*tmp;
		}
		answer+=c[ans]*tmp;
		}
		
		
		p(answer);
		
	}
}