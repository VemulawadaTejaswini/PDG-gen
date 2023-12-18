import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][20];
		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			for(int j=0;j<20;j++) {
				a[i][j] = (x>>j)&1;
			}
		}
		
		long res = 0;
		
		for(int i=0;i<n;) {
			int[] tmp = new int[20];
			int count = 0;
			int j;
			int back=0;
			for(j=i;j<n;j++) {
				if(check(tmp,a[j])) count++;
				else {
					back = reverse(a,j);
					break;
				}
			}
			res += count*(count+1)/2;
			res -= back*(back+1)/2;
			i=j-back;
		}
		
		System.out.println(res);
		in.close();
	}
	
	private static boolean check(int[] tmp,int[] a) {
		for(int i=0;i<20;i++) {
			tmp[i] += a[i];
			if(tmp[i]>=2) return false;
		}
		return true;
	}
	
	private static int reverse(int[][] a,int j) {
		int[] tmp = new int[20];
		for(int i=j;i>=0;i--) {
			if(!check(tmp,a[i])) return j-i-1;
		}
		return j-1;
	}
}
