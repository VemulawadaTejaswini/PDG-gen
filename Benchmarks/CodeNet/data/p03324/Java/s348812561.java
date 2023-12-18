import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int d=scan.nextInt(),n=scan.nextInt();
		if	(n==100)	++n;
		for (int i=1;i<=d;++i)
			n*=100;
		System.out.println(n);
	}
}
