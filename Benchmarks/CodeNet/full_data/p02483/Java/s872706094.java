import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d;

		if(a>b){
			d = a;
			a = b;
			b = d;
		}
		if(b>c){
			d = b;
			b = c;
			c = d;
		}
		if(c<a){
			d = c;
			c = a;
			a = d;
		}
		
		System.out.println(a+" "+b+" "+c);
	}
}