import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String string = scanner.next();
		int max = 0;
		int count = 0;
		for(int i = 0; i<n-1;i++){
			char c = string.charAt(i);
			if(c == 'I'){
				count++;
				max = Math.max(count, max);
			}else if (c == 'D') {
				count--;
				max = Math.max(count, max);
			}
		}
		System.out.println(max);
	}
}
