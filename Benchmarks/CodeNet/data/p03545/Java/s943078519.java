import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int a = Integer.parseInt(String.valueOf(in.charAt(0)));
		int b = Integer.parseInt(String.valueOf(in.charAt(1)));
		int c = Integer.parseInt(String.valueOf(in.charAt(2)));
		int d = Integer.parseInt(String.valueOf(in.charAt(3)));
		if(a+b+c+d==7)System.out.println(a+"+"+b+"+"+c+"+"+d+"=7");
		else if(a+b+c-d==7)System.out.println(a+"+"+b+"+"+c+"-"+d+"=7");
		else if(a+b-c+d==7)System.out.println(a+"+"+b+"-"+c+"+"+d+"=7");
		else if(a-b+c+d==7)System.out.println(a+"-"+b+"+"+c+"+"+d+"=7");
		else if(a+b-c-d==7)System.out.println(a+"+"+b+"-"+c+"-"+d+"=7");
		else if(a-b+c-d==7)System.out.println(a+"-"+b+"+"+c+"-"+d+"=7");
		else if(a-b-c+d==7)System.out.println(a+"-"+b+"-"+c+"+"+d+"=7");
		else if(a-b-c-d==7)System.out.println(a+"-"+b+"-"+c+"-"+d+"=7");
	}
}