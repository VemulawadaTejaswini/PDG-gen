import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int a;
		int b;
		int c;
		do {
			a=input.nextInt();
			b=input.nextInt();
			c=input.nextInt();
		}while(a<1&&a>100&&b<1&&b>100&&c<1&&c>100);
		if(a==b&&b==c) {
			System.out.println("1");
		}else if((a!=b&&b==c)||(a==b&&b!=c)||(a==c&&b!=c)) {
			System.out.println("2");
		}else{
			System.out.println("3");
		}
	}
}