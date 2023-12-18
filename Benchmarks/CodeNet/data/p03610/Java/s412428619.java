
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		for(int i = 1;i <= n;i += 2){
			System.out.print(str.charAt(i));
		}
	}
}
