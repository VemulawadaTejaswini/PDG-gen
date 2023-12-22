import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		while(n != 0 || m != 0){
			int[][] b = new int[n][m];
			int[] sum = new int[m];
			Recipe r = new Recipe(n, m);
			for(int i = 0; i < m; i++){
				sum[i] = 0;
			}
			for(int i = 0; i < n; i++){
				String tmp = scan.next();
				for(int j = 0; j < m; j++){
					b[i][j] = tmp.charAt(j) - '0';
					if(b[i][j] == 1){
						sum[j]++;
					}
				}
			}
			
			if(r.check(sum)){
				System.out.println(n);
			}else{
				for(int i = 0; i < m; i++){
					if(sum[i]%2 == 1){
						r.delete(i, 0, sum, b);
					}
				}
				System.out.println(r);
			}
			n = scan.nextInt();
			m = scan.nextInt();
		}
	}
}

class Recipe{
	private int n;
	private int m;
	private int max = -1;
	public Recipe(int n, int m){
		this.n = n;
		this.m = m;
	}
	public boolean check(int[] sum){
		for(int i = 0; i < m; i++){
			if(sum[i]%2 == 1){
				return false;
			}
		}
		return true;
	}
	public void delete(int column, int cnt, int[] sum, int[][] b){
		int[] tmp = new int[m];
		for(int i = 0; i < n; i++){
			if(b[i][column] == 1){
				cnt++;
				for(int j = 0; j < m; j++){
					if(b[i][j] == 1){
						sum[j]--;
					}
					tmp[j] = b[i][j];
					b[i][j] = -1;
				}
				if(check(sum)){
					if(max < n - cnt){
						max = n - cnt;
					}
				}else{
					if(n - max > cnt + 1){
						for(int j = 0; j < m; j++){
							if(sum[j]%2 == 1){
								column = j;
								delete(column, cnt, sum, b);
							}
						}
					}
				}
				for(int j = 0; j < m; j++){
					if(cnt == 1){
						b[i][j] = tmp[j];
					}
					if(tmp[j] == 1){
						sum[j]++;
					}
				}
			}
		}
	}
	public String toString(){
		if(max == -1){
			return "0";
		}else{
			return String.valueOf(max);
		}
	}
}
