import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String arraynum = br.readLine();
		String[] ary = arraynum.split(" ");
		int[][] a = new int[Integer.parseInt(ary[0])][Integer.parseInt(ary[1])];
		int[] v = new int[Integer.parseInt(ary[1])];
		int[] ans = new int[Integer.parseInt(ary[0])];
		for(int i = 0 ; i < a.length ; i++){
			String num = br.readLine();
			String[] numa = num.split(" ");
			for(int j = 0 ; j < a[i].length ; j++){
				a[i][j] = Integer.parseInt(numa[j]);
			}
		}
		
		for (int i = 0 ; i < v.length ; i++){
			String vect = br.readLine();
			v[i] = Integer.parseInt(vect);
		}
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < a[i].length ; j++){
				ans[i] = a[i][j]*v[j] + ans[i];
			}
			System.out.println(ans[i]);
		}

	}

}