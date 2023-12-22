import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int a=i.nextInt();
		int b=i.nextInt();
		int c=i.nextInt();
		if(a<b&&b<c)System.out.println("Yes");
		else System.out.println("No");
		}
	}