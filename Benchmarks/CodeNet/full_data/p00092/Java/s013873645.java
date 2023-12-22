import java.io.*;

class Main {
	private static String check = ".";

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				int mat[][] = new int[n][n];
				String str[] = new String[n];
				for (int i=0;i<n;i++) {
					str[i] = br.readLine();
					for (int j=0;j<n;j++) {
						if (str[i].charAt(j)=='.') mat[i][j] = 0;
						else if (str[i].charAt(j)=='*') mat[i][j] = 1;
					}
				}
				int max = 0;
				for (int i=0;i<n;i++) {
					if (str[i].indexOf(check)>=0) {
						for (int j=0;j<n;j++) {
							int d = Square(mat,i,j,n);
							if (max<d) {
								max = d;
								check = ".";
								for (int k=0;k<max;k++) check = check+".";
							}
						}
					}
				}
				System.out.println(max);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int Square(int[][] m,int x,int y,int n) {
		int c = 0;
		boolean end = false;
		while (x+c<n&&y+c<n) {
			for (int i=y;i<=y+c;i++) {
				if (m[i][x+c]==1) {
					return c;
				}
			}
			for (int i=x+c;i>=x;i--) {
				if (m[y+c][i]==1) {
					return c;
				}
			}
			c++;
		}
		return c;
	}
}