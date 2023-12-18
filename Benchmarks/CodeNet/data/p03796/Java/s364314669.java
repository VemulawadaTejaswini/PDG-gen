import java.util.*;

public class Main{
	public static int n,p,ans,v,x,i,j;
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		cal(1,1);
		p=(int)Math.pow(10,9)+7;
		System.out.println(ans%p);
	}
	public static void cal(int v,int x){
		j=v*x;
		if(x==n){ans = j; return;}
		cal(j,x+1);
	}
}