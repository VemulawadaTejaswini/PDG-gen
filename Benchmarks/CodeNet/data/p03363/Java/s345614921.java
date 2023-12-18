import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int[][] sumarr = new int[n][n];
		sumarr[0][0] = arr[0];

		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			sumarr[i][i] = arr[i];
			//System.out.print(sumarr[i][i]+" ");
			for(int j = i-1; j >= 0; j--) {
				sumarr[i][j] = arr[i]+sumarr[i-1][j];
				if(sumarr[i][j] ==0) {
					ans++;
					//System.out.println(i+","+j);
				}
				//System.out.print(sumarr[i][j]+" ");
			}
			//System.out.println();
		}

		System.out.println(ans);
	}
}
