import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int rest=x-a;
		int n=rest/b;
		int left=rest-n*b;
		System.out.println(left);
	}
}