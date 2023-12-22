import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		String s = sc.next();
		
		if(s.length() <= 3) {
			System.out.println(s);
			return;
		}
		
		s = s.substring(s.length()-3);
		
		int n = Integer.parseInt(s);
		
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		if(n< 1000) {
			System.out.println(n);
			return;
		}
		System.out.println(1000 - n);
		//for(int i = 0; i < ; i++)

		//System.out.println("Yes");
		//System.out.println("No");
		

	}
}
