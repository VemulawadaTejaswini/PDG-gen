import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		for(int i=0 ; i<cnt*2 ; i++) {
			char[] a = s.nextLine().toCharArray();
			char[] b = s.nextLine().toCharArray();
			System.out.println(solve(a, b));
		}
	}

	public static int solve(char[] a, char[] b) {
		int[][] result = new int[a.length][b.length];
		for(int i=0 ; i<b.length ; i++) {
			int index = i;
			for(int j=0 ; j<a.length ; j++) {
				for(int k=index ; k<b.length ; k++) {
					if(a[j]==b[k]) {
						if(j!=0) {
							result[j][i] = result[j-1][i] + 1;
							index = k;
							break;
						}else {
							result[j][i]++;
							index = k;
							break;
						}
					}else {
						if(j!=0)
							result[j][i] = result[j-1][i];
						else
							result[j+1][i] = result[j][i];
					}
				}
				if(j+1==a.length && i!=0) {
					result[a.length-1][i] = Math.max(result[a.length-1][i], result[a.length-1][i-1]);
				}
			}
		}
		return result[a.length-1][b.length-1];
	}

}