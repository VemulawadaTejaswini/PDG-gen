import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=3;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b) {
			ans--;
		}else if(b==c) {
			ans--;
		}else if(c==a) {
			ans--;
		}
		System.out.println(ans);
		sc.close();
	}
}