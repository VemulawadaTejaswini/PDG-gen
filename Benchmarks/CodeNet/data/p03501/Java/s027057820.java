import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		x=n*a;
		if(x>b) {
			x=b;
		}
		System.out.println(x);

	}

}
