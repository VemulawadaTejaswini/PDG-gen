import java.util.*;

public class Main {
	public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] first = new String[n][n];
		String[][] second = new String[n][n];
		
		for (int i=0;i < n;i++) {
			String str = sc.next();
			for (int j=0;j < n;j++) {
				first[i][j] = str.substring(j,j+1);
			}
		}
		int ans = 0;
		for (int i=0;i < n;i++) {
			for (int j=0;j < n;j++) {
				
				for (int k=0;k < n;k++) {
					for (int l=0;l < n;l++) {
						int x = (i+k) >= n ? (i+k) - n : (i+k);
						int y = (j+l) >= n ? (j+l) - n : (j+l);
						second[k][l] = first[x][y];
					}
				}
				
				boolean flag = true;
				for (int k=0;k < n/2;k++) {
					for (int l=0;l < n/2;l++) {
						if (!second[k][l].equals(second[l][k])) {
							flag =false;
							break;
						}
					}
				}
				if(flag) ans++;
			}
		}
		System.out.println(ans);
        }
}