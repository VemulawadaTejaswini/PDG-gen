import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().trim().charAt(0);
		
		StringBuilder sb = new StringBuilder();
		
		if(ch >= 'A' && ch <='Z')
			sb.append('A' + "\n");
		else if(ch >='a' && ch <= 'z')
			sb.append('a' + "\n");
		
		sc.close();
		
		System.out.println(sb);
	}

}