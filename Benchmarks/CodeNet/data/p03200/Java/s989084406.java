import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		long cnt = 0;
		long sum = 0;
		boolean flag = false;
		for(int i = 0; i < S.length(); i++) {
			if(S.substring(i, i + 1).equals("W")) {
				cnt++;
				if(flag) {
					sum = sum + (i - cnt + 1);
				}
			} else {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println(sum);
		} else {
			System.out.println(0);
		}
	}
}
