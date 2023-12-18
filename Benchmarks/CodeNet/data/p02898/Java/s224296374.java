import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
	/*static double res=0;
	 static void help(int p,int r,int n){
		double tmp=p;
		for(int i=1;i<=n;i++){
			double x=1+(double)r/1200 ;
			tmp*=x;
		}
		res+=tmp;
		int k=100000,m=360;
		for(int i=m;i>0;i--){
			help(k,5,i);
		}
		System.out.println("paid amount "+k*m+" ");
		System.out.println((long)res);
	}
*/
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
		int k=s.nextInt(); int res=0;
		for(int i=0;i<n;i++){
			if(s.nextInt()>=k){res++;}
		}
		
		System.out.println(res);	
		}
    }
	
		
	











