import java.util.*;

// Do not use int, use long!!

public class Main {
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			String s = sc.next();
			//1 operation , w mov left
			//so count each "w" how many "b" exists
			long countb = 0;
			long ans = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'B') {
					countb++;
				}else{
					ans += countb;
				}
			}

			System.out.println(ans);
			
			sc.close();
		}
	
}