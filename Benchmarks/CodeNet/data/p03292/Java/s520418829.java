import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int s1=Math.abs(a-b)+Math.abs(b-c);
		int s2=Math.abs(a-c)+Math.abs(b-c);
		int s3=Math.abs(a-b)+Math.abs(a-c);
		System.out.println(Math.min(s1, Math.min(s2,s3)));
	}
}