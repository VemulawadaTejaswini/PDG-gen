
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] chars = s.toCharArray();
		int count = 0;
		char c = '0';
		for(int i = 0; i < n; i++){
			if(c != chars[i]){
				count++;
				c = chars[i];
			}
		}
		System.out.println(count);
	}
}
