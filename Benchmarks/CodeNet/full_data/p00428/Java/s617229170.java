import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static int[][] data;
	public static void main(String[] args) {
		while(read()){
			solve();
		}

	}
	static boolean read(){
		n = sc.nextInt(); m = sc.nextInt();
		if(n == 0 && m == 0)return false;
		data = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				data[i][j] = sc.nextInt();
				//System.out.print(data[i][j]);
			}
			//System.out.println();
		}
		return true;
	}
	static void solve(){
		int []res = new int[m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(data[i][j] == 1) res[j]++;
			}
		}
		/*for(int i = 0; i < res.length; i++)
			System.out.print("res[" + i + "] = " + res[i] + " ");
		System.out.println();
*/
		int max = 0;
		int index = 0;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < m; j++){
				if(res[j] > max){
					max = res[j];
					index = j;
				}
			}
			System.out.print(index+1 + " ");
			res[index] = 0;
			max = 0;
			index = 0;
		}
		System.out.println();
	}

}