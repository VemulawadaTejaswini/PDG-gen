import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b){
			System.out.println("a>b");
		}
		if(a<b){
			System.out.println("a<b");
		}
		if(a==b){
			System.out.println("a==b");
		}
	}
}