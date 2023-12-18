import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt(),h=sc.nextInt();
		int x=sc.nextInt(),y=sc.nextInt();
		sc.close();
		System.out.println((long)w*h/2);
		if(x==w/2 && y==h/2) System.out.println("1");
		else System.out.println("0");
	}
}