import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int max = 0;
		Integer[] ii = new Integer[N];
		for(int i = 0; i < N; i++){
			ii[i] = Integer.parseInt(br.readLine());
			max += ii[i];
		}

		//合計
		if (max % 10 > 0) { System.out.println(max); return; }

		//配列のソート
		Arrays.sort(ii);
		
		for(int i = 0; i < N; i++){
			if( (max-ii[i])%10>0 ) { System.out.println(max-ii[i]); return; }
		}

		System.out.println(0);
		return;
	}


}
