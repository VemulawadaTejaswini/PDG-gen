import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		System.out.println(s(new Scanner(System.in).nextInt(),0));
	}
	public static int s(int n,int c){
		if(n<6)return c+n;
		int a=1,b=1;
		while(a*6<=n)a*=6;
		while(b*9<=n)b*=9;
		return Math.min(s(n-a,c+1),s(n-b,c+1));
	}
}