import java.util.Scanner;
public class Question90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int a = N-2;
		int b = M-2;

		if(N==1) a=1;
		if(M==1) b=1;

		System.out.println(a*b);
	}

}
