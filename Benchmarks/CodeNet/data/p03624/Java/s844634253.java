import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "None";
		Map<Character,Integer> check = new TreeMap<Character,Integer>();
		for(char c = 'a' ; c <='z';c++) {
			check.put(c, 0);
		}
		for(int i = 0; i <s.length(); i++) {
			int temp = check.get(s.charAt(i))+1;
			check.put(s.charAt(i),temp);
		}
		for(char i = 'a'; i <='z'; i++) {
			if(check.get(i) == 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(ans);
	}
}