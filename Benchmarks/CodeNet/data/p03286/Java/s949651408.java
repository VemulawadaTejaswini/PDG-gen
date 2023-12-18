import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;


	//
	int divm2(int a) {
		if(a>0) {
			return -(a/2);
		}else if(a<0){
			return (-a+1)/2;
		}else {
			return 0;
		}
	}

	String solv(int n) {
		if(n==0) {
			return "";
		}
		if(Math.abs(n)%2 == 0) {
			return solv(divm2(n))+"0";
		}else {
			return solv(divm2(n))+"1";
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		sc.close();

		if(N==0) {
			out.println(0);
		}else {
			out.println(solv(N));
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
