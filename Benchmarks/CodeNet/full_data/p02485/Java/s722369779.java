
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			String x = sc.next();
			int y = 0;

			if (x.charAt(0) == '0') {
				break;
			}

			for(int i = 0; i < x.length(); i++){
				char a = x.charAt(i);
				y += a-'0';
			}

			System.out.printf("%d\n",y);
		}
	}
}