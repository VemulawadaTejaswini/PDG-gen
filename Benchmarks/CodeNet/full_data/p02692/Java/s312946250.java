import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		char[] ans=new char[n];
		for(int i=0; i<n; i++){
			String s=sc.next();
			if(s.equals("AB")){
				if(a>b){
					a--;
					b++;
					ans[i]='B';
				}else{
					b--;
					a++;
					ans[i]='A';
				}
			}else if(s.equals("BC")){
				if(c>b){
					c--;
					b++;
					ans[i]='B';
				}else{
					b--;
					c++;
					ans[i]='C';
				}
			}else{
				if(a>c){
					a--;
					c++;
					ans[i]='C';
				}else{
					c--;
					a++;
					ans[i]='A';
				}
			}
			if(a<0 || b<0 || c<0){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		for(int i=0; i<n; i++){
			System.out.println(ans[i]);
		}
	}
}