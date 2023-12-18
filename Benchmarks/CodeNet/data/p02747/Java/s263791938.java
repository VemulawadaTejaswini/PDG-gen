import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		if(s.length()%2!=0) {
			System.out.println("No");
			System.exit(0);
		}
		for(int i=0;i<=s.length()-2;i+=2) {
			if(!s.substring(i, i+2).equals("hi")) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}