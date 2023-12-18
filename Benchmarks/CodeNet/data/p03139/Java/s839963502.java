
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=0;
		int min=0;

		if(n==a || n==b) {
			max=min=0;
		}
		if(a+b<=n) {
			if(a>b) {
				max=b;
				min=0;
			}else {
				max=a;
				min=0;
			}
		}
		if(a+b>n) {
			if(a>b) {
				max=b;
				min=a-b;
			}else {
				max=a;
				min=b-a;
			}
		}

		System.out.println(max);
		System.out.println(min);
	}
}
