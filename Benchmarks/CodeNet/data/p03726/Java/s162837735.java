import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n+1][n+1];
		int[] d = new int[1+n];
		for(int i=0; i<n-1; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			a[x][y] = 1;
			a[y][x] = 1;
			d[x] ++;
			d[y] ++;
		}
		
		boolean f = false;
		for(int i=1; i<=n ;i++) {
			int t = 0;
			for(int j=1; j<=n; j++) {
				if(a[i][j] == 1 && d[j] == 1)
					t ++;
			}
			if(t >= 2)	{
				f = true;
				break;
			}
		}
		
		if(f) 	System.out.println("First");
		else	System.out.println("Second");
	}
	
}
