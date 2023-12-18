import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int flag = 0;
		String s = sc.next();

		for(int i=0;i<a;i++) {
			if(s.substring(i,i+1).equals("-")) {
				flag = 1;
			}
		}
		if(!s.substring(a,a+1).equals("-")) {
			flag = 1;
		}
		for(int i=a+1;i<a+b+1;i++) {
			if(s.substring(i,i+1).equals("-")) {
				flag = 1;
			}
		}
		if(flag == 1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

	}

	public static int res(int n) {
		if(n==1) {
			return 1;
		}

		return n+res(n-1);
	}
}


