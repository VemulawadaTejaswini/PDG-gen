import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String tmpStr = br.readLine();

			if(tmpStr == null){
				break;
			}

			int[] a = new int[4];
			int[] b = new int[4];
			boolean[] inA = new boolean[10];
			Arrays.fill(inA, false);

			String[] tmpArray1 = tmpStr.split(" ");
			String[] tmpArray2 = br.readLine().split(" ");

			for(int i = 0; i < 4 ; i++){
				a[i] = Integer.parseInt(tmpArray1[i]);
				b[i] = Integer.parseInt(tmpArray2[i]);
				inA[a[i]] = true;
			}

			//ヒット＆ブローチェック
			int hit = 0;
			int blow = 0;
			for(int i = 0; i < 4; i++){
				if(a[i] == b[i]){
					hit++;
				}

				else if(inA[b[i]]){
					blow++;
				}
			}
//			blow -= hit;

			System.out.println(hit + " "+ blow);
		}
	}

}

