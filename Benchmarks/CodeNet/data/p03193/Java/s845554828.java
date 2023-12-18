import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int ans=0;
		int b=scan.nextInt();
		int c=scan.nextInt();
		for(int i=0;i!=a;i++) {
			int d=scan.nextInt();
			int e=scan.nextInt();
			if(d>=b&&e>=c)ans++;
		}
		System.out.println(ans);
    }
}