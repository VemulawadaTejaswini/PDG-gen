import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] p=new int[m];
		String[] s=new String[m];
		for(int i=0; i<m; i++){
			p[i]=sc.nextInt()-1;
			s[i]=sc.next();
		}
		int t=0;
		int f=0;
		boolean[] tf=new boolean[n];
		for(int i=m-1; i>=0; i--){
			if(!tf[p[i]] && s[i].equals("AC")){
				tf[p[i]]=true;
				t++;
			}else if(tf[p[i]] && s[i].equals("WA")){
				f++;
			}
		}
		System.out.println(t+" "+f);
	}	
}
