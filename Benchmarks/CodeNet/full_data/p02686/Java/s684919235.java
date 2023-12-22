import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		int l=0;
		for(int i=0; i<n; i++){
			String s=sc.next();
			int tr=0;
			int tl=0;
			for(int j=0; j<s.length(); j++){
				if(s.charAt(j)==')'){
					if(tr>0){
						tr--;
					}else{
						tl++;
					}
				}else{
					tr++;
				}
			}
			int tmpr=0;
			if(l-tr>0){
				l-=tr;
				tr=0;
			}else{
				tr-=l;
				l=0;
				tmpr=tr;
			}
			if(r-tl>0){
				r-=tl;
				tl=0;
			}else{
				tl-=r;
				r=0;
				l+=tl;
			}
			r+=tmpr;
		}
		int[] ksss=new int[1];
		if(l==0 && r==0){
			ksss[7]=1;
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
