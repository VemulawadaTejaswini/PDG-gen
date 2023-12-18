import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		s.close();
		int d=(int)Math.floor(b/a);
		System.out.println(Math.min(c, d));
	}
}
