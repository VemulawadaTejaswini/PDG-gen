
import java.util.Scanner;

public class Main {
	
	private static void kou2(int a,int b){
		int min = Math.min(a,b);
		for(int i=1;i<=min;i++){
			if(a%i + b%i == 0)
			System.out.println(i);
		}
	}
	
	private static void kou3(int a,int b,int c){
		int min  = Math.min(c,Math.min(a,b));
		for(int i=1;i<=min;i++){
				if(a%i + b%i + c%i == 0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		if(n==3){
			c = sc.nextInt();
			kou3(a,b,c);
		}
		if(n==2)
			kou2(a,b);
	}
}
