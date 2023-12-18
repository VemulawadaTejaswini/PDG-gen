import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int c=sc.nextInt();
		String s=sc.next();
		boolean[] a=new boolean[n+1];
		for(int i=1; i<=n; i++){
			if(s.charAt(i-1)=='x'){
				a[i]=true;
			}
		}
		boolean[] front=new boolean[n+1];
		boolean[] back=new boolean[n+1];
		int tmp=k;
		for(int i=1; i<=n; i++){
			if(!a[i] && tmp>0){
				front[i]=true;
				tmp--;
				i+=c;
			}
		}
		tmp=k;
		for(int i=n; i>=1; i--){
			if(!a[i] && tmp>0){
				back[i]=true;
				tmp--;
				i-=c;
			}
		}
		int fc=0;
		int bc=0;
		for(int i=1; i<=n; i++){
			if(front[i] && back[i] && fc==bc){
				System.out.println(i);
			}else if(front[i]){
				fc++;
			}else if(back[i]){
				bc++;
			}
		}
	}
}
