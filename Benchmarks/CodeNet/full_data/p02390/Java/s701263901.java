import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int S=sc.nextInt();
		int h=S/3600;
		int H=S%3600;
		int m=H/60;
		int M=H%60;
		int s=M/1;
		System.out.print(h);
		System.out.print(":");
		System.out.print(m);
		System.out.print(":");
		System.out.print(s);
		sc.close();
	}

}

