
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}
	
	public Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] data = new int[n][10];
		for(int i=0;i<n;i++){
			for(int j=0;j<10;j++){
				data[i][j] = sc.nextInt();
			}
		}
		
		solve(data);
	}
		
	private void solve(int[][] data){
		for(int i=0;i<data.length;i++){
			if(rec(data[i], 1, data[i][0], -1)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	
	private boolean rec(int[] row, int cur, int left, int right){
		if(cur>=10)
			return true;
		
		boolean res = false;
		
		if(row[cur]>left)
			res |= rec(row, cur+1, row[cur], right);
		
		if(!res && row[cur]>right)
			res |= rec(row, cur+1, left, row[cur]);
		
		return res;
		
	}
}