import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		char[] n = N.toCharArray();
		
		//10桁以外は除外
		if (N.length() == 1) {
			System.out.println(N);
			return;
		}
		
		int not9 = -1;
		for (int i = 0; i < N.length(); i++) {
			if (n[i] != '9') {
				not9 = i;
				break;
			}
		}
		
		int ans = (N.length() - 1) * 9;
		if (not9 == -1) {
			ans += 9;
		} else if (not9 == 0 && N.replaceAll("9", "").length() == 1) {
			ans += Character.getNumericValue(n[0]);
		} else if (not9 == 0 && N.replaceAll("9", "").length() != 1) {
			int head = Character.getNumericValue(n[0]);
			ans += n[0] == '1' ? 0 : head - 1;
		} else {
			ans += 8;
		}
		
		System.out.println(ans);
	}
	
}