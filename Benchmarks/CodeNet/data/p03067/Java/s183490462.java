
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		//int d=scan.nextInt();
		//int e=scan.nextInt();
		int ans=0;
		if(a>c&&b>c) {
			ans=1;
		}
		else {
			
		}
		System.out.println(ans==1?"Yes":"No");
	}
}
