import java.util.*;

public class Main{

	static int[][] multi;
	static int[] matR;
	static int[] matC;

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		multi = new int[n][n];
		matR = new int[n];
		matC = new int[n];

		for(int i = 0; i < n; i++){
			matR[i] = scan.nextInt();
			matC[i] = scan.nextInt();
		}

		System.out.println(Mat(0, n-1));

		scan.close();
		System.exit(0);
	}

	private static int Mat(int fr, int to){
		if(fr == to)
			return 0;
		if(multi[fr][to] == 0){
			int min = Integer.MAX_VALUE;
			for(int i = fr; i < to; i++){
				int r = Mat(fr, i) + Mat(i+1, to) + (matR[fr] * matC[i] * matC[to]);
				if(r < min)
					min = r;
			}
			multi[fr][to] = min;
		}
		return multi[fr][to];
	}
}