import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int copy;
		
		if(a < b){
			copy = a;
			a = b;
			b = copy;
		}
		
		if(b < c){
			copy = b;
			b = c;
			c = copy;
		}
		
		if(a < b){
			copy = a;
			a = b;
			b = copy;
		}
		
		System.out.println(a + " " + b + " " + c);
		sc.close();
	}
}
