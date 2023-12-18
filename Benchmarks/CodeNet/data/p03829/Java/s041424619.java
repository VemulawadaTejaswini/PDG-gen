import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] x=new int[n+1];
		for(int i=1;i<=n;i++){
			x[i]=sc.nextInt();
		}
		int tired=0;
		for(int i=1;i<=n-1;i++){
			if(a*(x[i+1]-x[i])>=b) tired=tired+b;
			else tired=tired+a*(x[i+1]-x[i]);
		}
		System.out.println(tired);
	}
}