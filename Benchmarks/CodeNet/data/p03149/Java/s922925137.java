import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int res = a*1000+b*100+c*10+d;
		
		String result = String.valueOf(res);
		if(result.equals("1974")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}