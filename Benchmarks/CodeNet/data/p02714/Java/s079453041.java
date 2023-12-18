import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] countrgb = new int[n];
		int maxR = 0;
		int maxG = 0;
		int maxB = 0;
		
		for(int i = 0; i< n; i++) {
			if(s.charAt(i) == 'R') {
				countrgb[i] = maxR++;
			}
			if(s.charAt(i) == 'G') {
				countrgb[i] = maxG++;
			}
			if(s.charAt(i) == 'B') {
				countrgb[i] = maxB++;
			}
		}
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1; k<n;k++) {
					if(s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k) && s.charAt(k) != s.charAt(i)) {
						if(s.charAt(k) == 'R') {
							ans += maxR - countrgb[k];
						}
						if(s.charAt(k) == 'G') {
							ans += maxG - countrgb[k];
						}
						if(s.charAt(k) == 'B') {
							ans += maxB - countrgb[k];
						}
						if(j+j-i<n && s.charAt(k) == s.charAt(j+j-i)) {
							ans--;
						}
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
