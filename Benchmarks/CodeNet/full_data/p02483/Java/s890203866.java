import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int x;

		if(a<b){
			if(b<c){
				System.out.printf("%d %d %d\n", a, b, c);
			}else if(a<c){
					x=b;
					b=c;
					c=x;
				System.out.printf("%d %d %d\n", a, b, c);
			}
		}else{
			if(b>c){
				x=a;
				a=c;
				c=x;
				System.out.printf("%d %d %d\n", a, b, c);
			}else{
				x=a;
				a=b;
				b=x;

				x=a;
				a=c;
				c=x;
				System.out.printf("%d %d %d\n", a, b, c);
			}			
		}
	}

}