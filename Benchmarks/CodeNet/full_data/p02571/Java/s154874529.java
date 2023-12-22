import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		
		int s_len = s.length();
		int t_len = t.length();
		
		String tmp;
		int count = 0;
		int change = 0;
		
		for(int i = 0; i < s_len - t_len; i++ ) {
			tmp = s.substring(i, i + t_len);
			
			for(int j = 0; j < t_len; j++) {
				if(tmp.charAt(j) == t.charAt(j)) {
					count++;
				}
			}
			
			if(change <= count) {
				change = count;
			}
			
			count = 0;
			
		}
		
		System.out.println(t_len - change);
		
		
	}

}