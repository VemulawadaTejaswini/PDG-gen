import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		String input = sc.nextLine();
		int b = sc.nextInt();
		
		StringBuilder s =new StringBuilder();
		s.append(input);
		
		String t = s.substring(b-1,b);
		
		
		
		for(int i = 1; i <= a; i++) {
			if(t.equals(s.substring(i-1,i)) != true) {
				s.replace(i-1, i,"*");
			}
		}
		
	
		System.out.println(s);
		System.out.println(t);
	}

}
