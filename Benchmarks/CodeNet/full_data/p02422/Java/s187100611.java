import java.io.IOException;
import java.util.Scanner;
public class Main {
	static String line = "";
	static char[] array = line.toCharArray();
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		line = sc.next();
		int x = sc.nextInt();

		for(int i=0;i<x;i++) {
			String o = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(o.equals("replace")) {
				String c = sc.next();
				replace(a, b, c);
			}else if(o.equals("reverse")) {
				reverse(a, b);
			}else if(o.equals("print")) {
				print(a, b);
			}
		}

		sc.close();
	}

	public static void replace(int a, int b, String c) {
		String x = line.substring(0, a);
		String y = line.substring(b+1);

		line = x + c + y;
	}

	public static void reverse(int a, int b) {
		String x = line.substring(0, a);
		String y = line.substring(b+1);
		String z = line.substring(a, b+1);
		char[] zc = z.toCharArray();
		int count = zc.length - 1;

		String d = "";

		for(int i=0; i<zc.length; i++) {
			d += String.valueOf(zc[count--]);
		}

		line = x + d + y;
	}

	public static void print(int a, int b) {
		System.out.println(line.substring(a, b+1));
	}
}
