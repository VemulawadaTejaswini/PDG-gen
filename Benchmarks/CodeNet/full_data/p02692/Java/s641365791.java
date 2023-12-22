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
		if(a+b+c==2){
			ArrayList<State> list=new ArrayList<>();
			String tmp=s[0];
			for(int i=0; i<n; i++){
				if(!tmp.equals(s[i])){
					list.add(new State(i,tmp));
					tmp=s[i];
				}
			}
			list.add(new State(n-1,tmp));
			int li=0;
			for(int i=0; i<n; i++){
				if(i-1==list.get(li).count){
					li++;
				}
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
					if(list.get(li).count-i==1){
						if(list.get(Math.min(list.size()-1,li+1)).idx.equals("BC")){
							b++;
							a--;
							ans[i]='B';
						}else{
							a++;
							b--;
							ans[i]='A';
						}
					}else{
						b--;
						a++;
						ans[i]='A';
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
					if(list.get(li).count-i==1){
						if(list.get(Math.min(list.size()-1,li+1)).idx.equals("AB")){
							b++;
							c--;
							ans[i]='B';
						}else{
							c++;
							b--;
							ans[i]='C';
						}
					}else{
						b--;
						c++;
						ans[i]='C';
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
					if(list.get(li).count-i==1){
						if(list.get(Math.min(list.size()-1,li+1)).idx.equals("BC")){
							c++;
							a--;
							ans[i]='C';
						}else{
							a++;
							c--;
							ans[i]='A';
						}
					}else{
						c--;
						a++;
						ans[i]='A';
					}
				}
			}
			if(a<0 || b<0 || c<0){
				System.out.println("No");
				return;
			}
			}
		}else{
		for(int i=0; i<n; i++){
			if(s[i].equals("AB")){
				if(a>b){
					a--;
					b++;
					ans[i]='B';
				}else{
					b--;
					a++;
					ans[i]='A';
				}
			}else if(s[i].equals("BC")){
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
