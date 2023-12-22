import java.util.Scanner;

public class Main {
	int lengthOfLongestCommonSubsequence(String s1, String s2)

	{
		int m = s1.length();
		int n = s2.length();
		int[][]lcs = new int[m+1][n+1];
		
		
		for(int i = 1 ; i<m + 1; i ++) {
			for(int j=1; j<n+1; j++) {
				char a = s1.charAt(i-1);
				char b = s2.charAt(j-1);
						
				if (a != b) {
					lcs[i][j] = max(lcs[i-1][j],lcs[i][j-1]);
				}
				else {
					lcs[i][j] = 1 + lcs[i-1][j-1];
				}
				
				
			}
		}
		return lcs[m][n];
	}
	int max(int a, int b)
	{
		return (a > b) ? a : b;
	}
	int min(int a, int b) {
		return (a < b) ? b : a;
	}
	public static void main(String[] args)
	{
		Main lcsobject = new Main();
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < q; i ++) { // X
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			System.out.println(lcsobject.lengthOfLongestCommonSubsequence(s1, s2));
			
			
		
		}
	
		in.close();
	}
}


