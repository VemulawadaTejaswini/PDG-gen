import java.util.Scanner;

class Main {
	static int count=0;
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m=in.nextInt();

		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			c[i] = in.nextInt();

		}
		if (solve(c,0,n)) {
			System.out.println(count);
		}


		in.close();
	}

	private static boolean solve(int[] c,int i, int m) {

	   if (m == 0) {

	     return true;
	   }
	   if (i == c.length) {
	     return false;
	   }
	   if(solve(c,i + 1, m) ) {
		   return true;
	   }else if( solve(c,i + 1, m - c[i])) {
		   count+=1;
		   return true;
	   }else {
		   return false;
	   }

	}
}

