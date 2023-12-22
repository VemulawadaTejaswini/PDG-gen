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
		
		int[] pc=new int[pop/2+2];
		
		//calculate pop
		int k=1;
		
		for(int i=1;i<=pop/2;i++) {
			String bin = Integer.toBinaryString(i);
			int count=0;
			for(int j=0;j<bin.length();j++) {
				if(bin.charAt(j)=='1')count++;
			}
			pc[i]=count;
		}
		
	
		for(int i=0;i<n;i++) {
			int ans=0;
			long tx=x;
			int tp=pop;
			if(tx==0) {
				System.out.println(ans);
				continue;
			}
			ans=1;
			
			if(sx.charAt(i)=='0') {
				tp++;
				tx=tx%tp + (long)Math.pow(2, n-i-1)%tp;
				
			}else {
				tp--;
				tx=tx%tp + (long)Math.pow(2, n-i-1)%tp;
				
			}
			//System.out.println("n-i-1 "+ (n-i-1) +" tx "+tx+" tp "+tp);
			
			while(tx>0 && tp>0) {
				tx%=tp;
				tp=pc[(int) tx];
				ans++;
			//System.out.println("tx "+tx+" tp "+tp+" ans "+ans);

			}
			//if(tp==1)ans++;
			
			System.out.println(ans);
			
		}
		
	
		
	}
	
	
}
