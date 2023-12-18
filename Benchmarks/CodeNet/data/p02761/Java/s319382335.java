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
		int[] s=new int[100];
		int[] c=new int[100];
		
		for(int i=0;i!=M;i++) {
			s[i]=0;
			c[i]=0;
		}
		boolean a=true;
		for(int i=1;i<=M;i++) {
			int si=sc.nextInt();//3
			int ci=sc.nextInt();//2
			if(si==1&&ci==0&&N!=1) {
				p("-1");
				a=false;
			}
			if(s[si]!=0) {
				if(c[si]!=ci) {
					p("-1");
					a=false;}
				}else {
				s[si]++;
				c[si]=ci;
			}
			
			
		}
		
		
		if(a) {
		int tmp=1;
		int answer=0;//c[ans]
		for(int ans=1;ans<=N;ans++) {
			tmp=1;
		for(int i2=N-ans+1;i2>1;i2--) {	
			tmp=10*tmp;
		}
		answer+=c[ans]*tmp;
		}
		
		
		p(answer);}
		
	}
}
