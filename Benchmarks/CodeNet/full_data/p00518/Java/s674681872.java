import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		int[][] a = new int[7][n];
		
		int[] J = new int[]{0,3,5,6};
		int[] O = new int[]{1,3,4,6};
		int[] I = new int[]{2,4,5,6};
		int[] p = new int[]{0,1,3,4,5,6};
		int[] q = new int[]{1,2,3,4,5,6};
		int[] r = new int[]{0,2,3,4,5,6};
		
		a[3][0] = 1;
		a[5][0] = 1;
		a[6][0] = 1;
		char c = s.charAt(0);
		if(c=='J') a[0][0] = 1;
		else if(c=='O') a[5][0] = 0;
		else if(c=='I') a[3][0] = 0;
		
		for(int i=1;i<n;i++){
			c = s.charAt(i);
			
			if(c=='J') for(int j=0;j<4;j++) a[0][i] += a[J[j]][i-1];
			else if(c=='O') for(int j=0;j<4;j++) a[1][i] += a[O[j]][i-1];
			else if(c=='I') for(int j=0;j<4;j++) a[2][i] += a[I[j]][i-1];
			if(c!='I') for(int j=0;j<6;j++) a[3][i] += a[p[j]][i-1];
			if(c!='J') for(int j=0;j<6;j++) a[4][i] += a[q[j]][i-1];
			if(c!='O') for(int j=0;j<6;j++) a[5][i] += a[r[j]][i-1];
			for(int j=0;j<7;j++) a[6][i] += a[j][i-1];
			
			for(int j=0;j<7;j++) a[j][i] %= 10007;
		}
		
		for(int i=1;i<7;i++) a[0][n-1] += a[i][n-1];
		System.out.println(a[0][n-1]%10007);
	}

}