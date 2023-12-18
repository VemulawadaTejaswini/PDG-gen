import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();

		for(int i=0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("-") && i!=a+1) {
				System.out.println("No");
				System.exit(0);
			}
		}

		if(s.substring(a,a+1).equals("-")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

	public static int res(int n) {
		if(n==1) {
			return 1;
		}

		return n+res(n-1);
	}
}



