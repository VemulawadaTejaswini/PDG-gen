import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		final int N = sc1.nextInt();
		String[] W = new String[N];
		for(int i = 0; i < N; i++) {
			W[i] = sc2.nextLine();
		}
		
		boolean flag = true;
		
		for(int i = 0; i < N; i++) {
			if(i >= 1) {
				if(W[i].charAt(0) != W[i - 1].charAt(W[i - 1].length() - 1)) {
					//System.out.println(i);
					flag = false;
				}
			}
			for(int j = 0; j < i; j++) {
				if(W[i].equals(W[j])) {
					flag = false;
				}
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
