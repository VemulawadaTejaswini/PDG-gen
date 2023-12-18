
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String tmp =s.substring(k-1, k).toLowerCase() ;
		String ans = s.replace(s.substring(k-1, k), tmp);
		System.out.println(ans);
		sc.close();
	}
}
