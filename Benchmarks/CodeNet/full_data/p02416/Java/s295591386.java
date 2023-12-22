
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			
			String s = sc.next();
			if("0".equals(s)){
				break;
			}
			char[] chars = s.toCharArray();
			int sum = 0;
			for(char c : chars){
				sum += (int)c - 3 * 16;
			}
			System.out.println(sum);
		}
	}
}

