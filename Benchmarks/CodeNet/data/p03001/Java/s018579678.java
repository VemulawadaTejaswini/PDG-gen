import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long w=sc.nextLong(),h=sc.nextLong();
		int x=sc.nextInt(),y=sc.nextInt();
		sc.close();
		System.out.printf("%.10f\n",(double)w*(double)h/2);
		if((double)x==(double)w/2 && (double)y==(double)h/2) System.out.println("1");
		else System.out.println("0");
	}
}