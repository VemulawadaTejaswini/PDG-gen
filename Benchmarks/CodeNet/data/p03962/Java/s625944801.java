import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=3;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b) {
			if(b!=c) {
				ans=2;
			}else {
				ans=1;
			}
		}else if(b==c) {
			if(c!=a) {
				ans=2;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}