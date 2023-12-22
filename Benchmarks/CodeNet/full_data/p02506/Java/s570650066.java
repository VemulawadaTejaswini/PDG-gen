import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String W = sc.next().toUpperCase();
		
		int cnt = 0;
		
		while(true) {
			String T = sc.next();
			
			if(T.equals("END_OF_TEXT")) {
				break;
			}
			
			if(T.toUpperCase().equals(W)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}