import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next(),b=sc.next();
		String c= new StringBuilder().append(a).append(b).toString();
		double num = (double)Integer.valueOf(c);

		double sqrtnum=Math.sqrt(num);
		if(Math.floor(sqrtnum)==sqrtnum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}