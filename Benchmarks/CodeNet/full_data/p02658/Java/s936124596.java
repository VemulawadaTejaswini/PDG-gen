import java.util.Scanner;

public class Main {
	static long N;
	static long X=1;
	static double Y;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		for(int a=0;a<N;a++) {
			X=X*sc.nextLong();
		}
		Y=Math.pow(10, 18);
		if(X>Y) {
			System.out.println("-1");
		}
		else {
			System.out.println(X);
		}
		}

}