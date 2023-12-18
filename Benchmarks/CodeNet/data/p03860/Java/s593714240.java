import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next(),b=sc.next(),c=sc.next();
		System.out.println(a.charAt(0)+b.charAt(0)+c.charAt(0));
		sc.close();
	}
}