import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		for(int i=0;i<n;i++){
			String a = stdIn.next();
			char[] b = new char[10];
			b=a.toCharArray();
			Arrays.sort(b);
			String c = String.valueOf(b);
			int min = Integer.parseInt(c);
			int max = 0;
			for(int j=0;j<8;j++){
				max*=10;
				max+=b[7-j]-'0';
			}
			System.out.println(max-min);
		}
	}
}