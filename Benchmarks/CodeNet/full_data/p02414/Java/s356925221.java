import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int n, m, l;
	private static int[][] a, b;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		n = Integer.parseInt(strArr[0]);
		m = Integer.parseInt(strArr[1]);
		l = Integer.parseInt(strArr[2]);
		
		a = new int[n][m];
		b = new int[m][l];
		
		for(int i = 0;i < n;i++){
			a[i] = toIntArray(br.readLine().split(" "));
		}
		
		for(int i = 0;i < m;i++){
			b[i] = toIntArray(br.readLine().split(" "));
		}
		
		
		for(int i = 0;i < n;i++){
			for(int j = 0;j < l;j++){
				System.out.print(get(i, j));
				if(j == l - 1){
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	private static int get(int r, int c){
		int sum = 0;
		for(int i = 0;i < m;i++){
			sum += a[r][i] * b[i][c];
		}
		return sum;
	}
	
	private static int[] toIntArray(String[] strArray){
		int[] arr = new int[strArray.length];
		for(int i = 0;i < arr.length;i++){
			arr[i] = Integer.parseInt(strArray[i]);
		}
		return arr;
	}
}