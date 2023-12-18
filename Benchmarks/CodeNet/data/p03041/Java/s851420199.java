import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			String tmp = null;
			
			switch (s.substring(k-1,k)) {
			case "A":
				tmp = "a";
				break;
			case "B":
				tmp = "b";
				break;
			case "C":
				tmp = "c";
				break;
			}
			
			System.out.println(s.substring(0,k-1) + tmp + s.substring(k));	
		}
	}
}