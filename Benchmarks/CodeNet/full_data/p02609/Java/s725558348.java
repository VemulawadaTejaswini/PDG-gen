import java.util.*;
import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String sx=sc.next();
		int x=0;//10進数標記のn
		int pop=0;
		
		for(int i=0;i<n;i++) {
			if(sx.charAt(i)=='1') {
				x+=Math.pow(2, n-i-1);
				pop++;
			}
		}
		
		
		for(int i=0;i<n;i++) {
			int ans=0;
			int tx=x;
			int tp=pop;
			if(tx==0) {
				System.out.println(ans);
				continue;
			}
			//System.out.println("tx "+tx+" tp "+tp);
		
			if(sx.charAt(i)=='0') {
				tp++;
				tx%=tp;
				tx+=(long)Math.pow(2, n-i-1)%tp;
				tx%=tp;
				tp=calc(tx);
				ans++;
				
			}else {
				tp--;
				tx%=tp;
				tx-=(long)Math.pow(2, n-i-1)%tp;
				tx=(tx+tp)%tp;
				tp=calc(tx);
				ans++;
				
			}
			//System.out.println("n-i-1 "+ (n-i-1) +" tx "+tx+" tp "+tp);
			
			while(tx>0 && tp>0) {
				tx%=tp;
				tp=calc(tx);
				ans++;
			//System.out.println("tx "+tx+" tp "+tp+" ans "+ans);

			}
			//if(tp==1)ans++;
			
			System.out.println(ans);
			
		}
		
	
		
	}
	
	static int calc(int tx) {
		String bin = Integer.toBinaryString(tx);
		int count=0;
		for(int j=0;j<bin.length();j++) {
			if(bin.charAt(j)=='1')count++;
		}
	    return count;
	}
	

}
