import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String dream = "dream";
		String erase = "erase";
		
		boolean flag = true;
		int now = 0;
		while(flag) {
			if(now == str.length()) {
				break;
			}
			
			if(now + 5 > str.length()) {
				System.out.println("NO");
				return;
			}
			
			if(str.substring(now, now + 5).equals(dream)) {
				if(now + 5 == str.length()) break;
				if(str.substring(now + 5, now + 7).equals("er")) {
					if(str.substring(now + 7, now + 8).equals("a")) {
						now += 5;
						continue;
					} else {
						now += 7;
						continue;
					}
				} else {
					now += 5;
					continue;
				}
			} else if(str.substring(now, now + 5).equals(erase)) {
				if(now + 5 == str.length()) break;
				if(str.substring(now + 5, now + 6).equals("r")) {
					now += 6;
					continue;
				} else {
					now += 5;
					continue;
				}
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
