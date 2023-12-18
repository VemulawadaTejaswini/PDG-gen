import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		for(int i=0; i<s.length; i++) {
			s[i] = (char)('A' + ((s[i]-'A'+N)%26));
		}
		
		System.out.println(String.valueOf(s));

		sc.close();
	}
}
