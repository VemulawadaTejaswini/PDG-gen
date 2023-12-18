import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		String str = s.substring(0,k)+s.substring(k,k+1).toLowerCase()+s.substring(k+1);
	}
}
