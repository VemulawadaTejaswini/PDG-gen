import java.util.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			String d = sc.next();
			int b = sc.nextInt();
			if(d.equals("?")) break;
			if(d.equals("+")) System.out.println(a + b);
			if(d.equals("-")) System.out.println(a - b);
			if(d.equals("*")) System.out.println(a * b);
			if(d.equals("/")) System.out.println(a / b);
		}
	}
}