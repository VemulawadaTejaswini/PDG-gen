import java.util.Scanner;


public class Main {
	
	public static int Len_LCS(String x, String y) {
		int len_x = x.length();
		int len_y = y.length();
		int i = 1, j = 1;
		int [][] L = new int[len_x+1][len_y+1];
		for(i=1; i<=len_x; i++)
			for(j=1; j<=len_y; j++)
			{
				if(x.charAt(i-1)!=y.charAt(j-1))
					L[i][j] = max(L[i-1][j], L[i][j-1]);
				else
					L[i][j] = 1 + L[i-1][j-1];
			}
		return L[i-1][j-1];
	}

	public static int max(int a, int b){
		return (a>=b) ? a : b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num_pairs = scan.nextInt();
		while (num_pairs-- > 0) {
			String x =  scan.next();
			String y =  scan.next();
//			System.out.println(x);
//			System.out.println(y);
			System.out.println(Len_LCS(x,y));
		}
		scan.close();
	}
}
