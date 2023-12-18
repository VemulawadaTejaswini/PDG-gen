import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] D = W.split(" ");

		int[] d = new int[D.length];
		for(int i=0;i<d.length;i++){
			d[i]=Integer.parseInt(D[i]);
		}
		Arrays.sort(d);

		int l = N/2 -1 ;
		int r = N/2;

		int ans = d[r] - d[l] ;

		if(ans <= 0){
			ans =0;
		}
		System.out.println(ans);

	}


}
