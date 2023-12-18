import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		for (int i = str.length()-2; i >=0 ; i-=2) {
			int[] count = getC(str.substring(i,str.length()));
			int total = 0;
			for (int j:count){
				total +=j;
			}
			if(total == 26){
				System.out.println(i);
				return;
			}
		}
	}

	public static int[] getC(String str){
		int[] count = new int[26];
		Arrays.fill(count,1);
		for (int i = 0,l = str.length(); i < l ;i++) {
			count[str.charAt(i)-'a']*=-1;
		}
		return count;
	}

}