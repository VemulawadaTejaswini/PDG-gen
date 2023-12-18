import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n==1){
			System.out.println(0);
			return;
		}
		if(n<m){
			System.out.println(-1);
			return;
		}
		StringBuilder ans=new StringBuilder();
		int[] s=new int[n];
		Arrays.fill(s,-1);
		for(int i=0; i<m; i++){
			int tmps=sc.nextInt()-1;
			int tmpc=sc.nextInt();
			if(tmps==0 && tmpc==0){
				System.out.println(-1);
				return;
			}
			if(s[tmps]!=-1 && s[tmps]!=tmpc){
				System.out.println(-1);
				return;
			}
			s[tmps]=tmpc;
		}
		for(int i=0; i<n; i++){
			if(s[i]!=-1){
				ans.append(s[i]);
			}else{
				if(i==0){
					ans.append("1");
				}else{
					ans.append("0");
				}
			}
		}
		System.out.println(ans);
	}
}
