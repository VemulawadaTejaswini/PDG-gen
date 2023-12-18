import java.util.*;

	

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=sc.nextInt();

		System.out.println(a+b+c+Math.max(Math.max(a,b),c)*(pow(2,k)-1));
	}
	
	public static int pow(int a,int b){
		int x=1;
		for(int i=0;i<b;i++){
			x*=a;
		}
		return x;
	}
}