import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		int[][] py = new int[m][3];
		int[] count = new int[n];
		for (int i = 0;i < m; ++i){
			py[i][0] = Integer.parseInt(scan.next());
			py[i][1] = Integer.parseInt(scan.next());
			py[i][2] = i;
		}

		Arrays.sort(py,(x,y)->Integer.compare(x[1], y[1]));
		String[] ans = new String[m];
		for (int i = 0;i < m; ++i){
			ans[py[i][2]] =  String.format("%06d%06d", py[i][0], ++count[py[i][0]-1]);
		}

		for (int i =0;i < m; ++i){
			System.out.println(ans[i]);
		}

	}

}


//end