import java.util.Scanner;

public class Main {
	static int H_1;
	static int H_2;
	static int M_1;
	static int M_2;
	static int K;
	static int x;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		H_1=sc.nextInt()*60;
		M_1=sc.nextInt();
		H_2=sc.nextInt()*60;
		M_2=sc.nextInt();
		K=sc.nextInt();
		x=H_2+M_2-H_1-M_1-K;
		System.out.println(x);
	}
}