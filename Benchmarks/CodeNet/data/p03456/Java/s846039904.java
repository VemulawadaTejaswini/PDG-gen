import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String aux1 = Integer.toString(a);
		String aux2 = Integer.toString(b);
		aux1.concat(aux2);
		int res = Integer.parseInt(aux1);
		int sqrt = (int)Math.sqrt(res);
		if(sqrt*sqrt == res)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
