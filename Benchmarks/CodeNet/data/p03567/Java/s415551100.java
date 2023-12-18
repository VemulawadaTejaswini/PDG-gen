import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		if(s.contains("AC")) System.out.println("Yes");
		else System.out.println("No");
	}
}