import java.util.*;

public class Main{
	public static int n,ans,v,x,i,j;
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		cal(1,1);
		System.out.println(ans%((Math.pow(10,9))+7));
	}
	public static void cal(int v,int x){
		j=v*x;
		if(x==n){ans = j; return;}
		cal(j,x+1);
	}
}
