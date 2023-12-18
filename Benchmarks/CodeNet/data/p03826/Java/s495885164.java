import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int aa=a*b;
		int bb=c*d;
		int answer = 0;

		if(aa>bb) {
			answer = aa;
		}else if(aa<=bb) {
			answer = bb;
		}
		System.out.println(answer);

	}

}