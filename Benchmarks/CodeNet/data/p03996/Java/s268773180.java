import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int N = cin.nextInt();
		int M = cin.nextInt();
		int Q = cin.nextInt();
		
		int[] checker = new int[Q];
		
		for (int i = 0; i < Q; i++) {
			int x = cin.nextInt();
			checker[x-1] = (checker[x-1]+1)%N;
		}
		
		int standing = 0;
		boolean ans = true;
		for (int i = 1; i < Q; i ++) {
			if (checker[i] > 0) {
				ans = false;
				if (standing > 0) {
					standing -= checker[i];
				} else {
					standing += checker[i];
				}
			}
		}
		
		if (ans) {
			System.out.println("Yes");
		} else {
			if (standing == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
//		System.out.println(ans);
		
		//if number across are same.
	}

}
