import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(n == 26) {
			for(int i = n - 1 ; i >= 1 ; i--) {
				if(s.charAt(i - 1) < s.charAt(i)){
					String fix = s.substring(0, i - 1);
					char[] change = s.substring(i - 1).toCharArray();
					Arrays.sort(change);
					System.out.println(fix + change[1]);
					return;
				}
			}
			System.out.println(-1);
		} else {
			Set<Character> set = new TreeSet<>();
			for(char c = 'a' ; c <= 'z' ; c++) set.add(c);
			for(int i = 0 ; i < n ; i++) set.remove(s.charAt(i));
			for(char key : set) {
				System.out.println(s + key);
				return;
			}
		}
	}
}
