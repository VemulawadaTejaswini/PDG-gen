
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		//String str=scan.next();
		int ans=0;
		int c=Math.max(a, b);
		System.out.println(c+c-1);
	}
}