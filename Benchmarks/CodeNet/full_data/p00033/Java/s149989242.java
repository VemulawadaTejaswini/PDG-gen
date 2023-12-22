import java.util.*;

public class Main {

	static int dset;
	static int[] balls = new int[10];

	public static boolean dfs(int l,int r,int d){	//lは左に入っている一番上の球の番号、dは深さ

		if(d==10)
			return true;

		if(balls[d]>l) return dfs(balls[d],r,d+1);

		if(balls[d]>r) return dfs(l,balls[d],d+1);

		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		dset =scan.nextInt();
		boolean[] result = new boolean[dset];
		for(int i=0;i<dset;i++){
			for(int j=0;j<10;j++){
				balls[j]=scan.nextInt();
			}
			result[i] = dfs(0,0,0);
		}

		for(int i=0;i<dset;i++){
			if(result[i])
				System.out.println("YES");
			else
				System.out.println("NO");
		}



	}
}