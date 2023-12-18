import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==1||a==0||b==1||b==0||c==1||c==0) {
			System.out.println(a+b+c);
		}
	}
}