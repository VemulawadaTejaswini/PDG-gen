


import java.util.Arrays;
import java.util.Scanner;



public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = 1<<n;
		int[] s = new int [size];
		for (int i=0;i<size;i++) {
			s[i]=sc.nextInt();
		}
		
		Arrays.sort(s);
		
		System.out.println (isPossible (s, n) ? "Yes" : "No"); 
		
	}
	
	static boolean isPossible (int[]s , int n) {
		for (int i=0;i<n;i++) {
			int size = 1<<i;
			for (int j = 0;j<size;j++) {
				if (s[s.length-1-j] <= s[s.length-1-j-size]) {
					return false;
				}
			}
		}
		return true;
	}

	
}





