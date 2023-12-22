import java.util.Scanner;

public class SLE{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int compere;

		if(b<a){
			compere = b;
			b = a;
			a = compere;
		}
		if(c<a){
			compere = c;
			c = a;
			a = compere; 
		}
		if(c<b){
			compere = c;
			c = b;
			b = compere;
		}
		System.out.printf("%d %d %d\n", a, b, c);
	}
}