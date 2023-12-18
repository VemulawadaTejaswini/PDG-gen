import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		String astr = String.valueOf(a);
		String bstr = String.valueOf(b);
		String cstr = String.valueOf(c);
		String dstr = String.valueOf(d);
		
		String res = astr + bstr + cstr + dstr;
		
		if(res.equals("1974")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
