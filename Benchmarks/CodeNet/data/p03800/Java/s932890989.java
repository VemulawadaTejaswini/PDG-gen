import java.math.BigInteger;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char c[]=new char[n+2];
		String str=sc.next();
		for(int i=0;i<n;i++) {
			c[i]=str.charAt(i);
		}
		c[n]=c[0];
		c[n+1]=c[1];
		String a[]=new String [4];
		a[0]=str(c,n,'s','s');
		a[1]=str(c,n,'s','w');
		a[2]=str(c,n,'w','s');
		a[3]=str(c,n,'w','w');
		
		/*for(int i=0;i<4;i++) {
			System.out.println(a[i]);
		}*/
		
		boolean s[]=new boolean[4];
		s[0]=f(c,n,a[0]);
		s[1]=f(c,n,a[1]);
		s[2]=f(c,n,a[2]);
		s[3]=f(c,n,a[3]);
		boolean t=true;
		for(int i=0;i<4;i++){
			if(s[i]){
				
				System.out.println(a[i].substring(0,n).toUpperCase());
				t=false;
				break;
			}
		}
		
		if(t){
			System.out.println("-1");
		}
		
		
		
		
	}
	public static String str(char c[],int n,char c1,char c2){
		char s1[]=new char[c.length];
		s1[0]=c1;
		s1[1]=c2;
		for(int i=1;i<n+1;i++){
			if(c[i]=='o'){
				if(s1[i]=='s'){
					if(s1[i-1]=='s'){
						s1[i+1]='s';
					}else{
						s1[i+1]='w';
					}
				}else{
					if(s1[i-1]=='s'){
						s1[i+1]='w';
					}else{
						s1[i+1]='s';
					}
				}
				
			}else{
				if(s1[i]=='s'){
					if(s1[i-1]=='s'){
						s1[i+1]='w';
					}else{
						s1[i+1]='s';
					}
				}else{
					if(s1[i-1]=='s'){
						s1[i+1]='s';
					}else{
						s1[i+1]='w';
					}
				}
			}
		}
		
		String ans="";
		for(int i=0;i<c.length;i++){
			ans+=s1[i];
		}
		return ans;
	}
	public static boolean f(char c[],int n,String ans){
		char s1[]=ans.toCharArray();
		if(s1[n]==s1[0]&&s1[n+1]==s1[1]) {
			return true;
		}else {
			return false;
		}
	
		
	}

}
       