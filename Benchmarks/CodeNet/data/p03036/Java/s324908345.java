import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		for(int i=2000;i<2010;i++) {
			c=a*c-b;
			if(i>=2000) {
				System.out.println(c);
			}
		}
	}
}
