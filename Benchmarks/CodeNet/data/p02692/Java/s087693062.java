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
		String[] s=new String[n];
		for(int i=0; i<n; i++){
			s[i]=sc.next();
		}
		for(int i=0; i<n; i++){
			if(s[i].equals("AB")){
				if(a>b){
					a--;
					b++;
					ans[i]='B';
				}else if(a<b){
					b--;
					a++;
					ans[i]='A';
				}else{
					if(i!=n-1 && !s[i+1].equals("AB")){
						if(s[i+1].equals("BC")){
							b++;
							a--;
							ans[i]='B';
						}else{
							b--;
							a++;
							ans[i]='A';
						}
					}else{
						a--;
						b++;
						ans[i]='B';
					}
				}
			}else if(s[i].equals("BC")){
				if(c>b){
					c--;
					b++;
					ans[i]='B';
				}else if(c<b){
					b--;
					c++;
					ans[i]='C';
				}else{
					if(i!=n-1 && !s[i+1].equals("BC")){
						if(s[i+1].equals("AB")){
							b++;
							c--;
							ans[i]='B';
						}else{
							b--;
							c++;
							ans[i]='C';
						}
					}else{
						c--;
						b++;
						ans[i]='B';
					}
				}
			}else{
				if(a>c){
					a--;
					c++;
					ans[i]='C';
				}else if(a<c){
					c--;
					a++;
					ans[i]='A';
				}else{
					if(i!=n-1 && !s[i+1].equals("AC")){
						if(s[i+1].equals("BC")){
							c++;
							a--;
							ans[i]='C';
						}else{
							c--;
							a++;
							ans[i]='A';
						}
					}else{
						a--;
						c++;
						ans[i]='C';
					}
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
	static class State{
		int count;
		String idx;
		State(int count,String idx){
			this.count=count;
			this.idx=idx;
		}
	}
}
