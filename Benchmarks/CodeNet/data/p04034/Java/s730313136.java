import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split(" ");
		int n = Integer.parseInt(array[0]);
		int m = Integer.parseInt(array[1]);
		int ret = 0;

		int[] box = new int[n];//n個の箱を作成
		boolean[] red = new boolean[n];//n個の箱分赤いボールが入っている可能性があるかどうかのフラグの入れ物を作成

		for(int i=0;i<n;i++){//箱の中に全て1個のボールを入れる
			box[i] = 1;
		}
		red[0] = true;//1個めの箱に赤いボールが入っているのでtrueにする


		for(int i=0;i<m;i++){//m回の処理分ループ
			array = br.readLine().split(" ");
			int from = Integer.parseInt(array[0])-1;
			int to = Integer.parseInt(array[1])-1;

			if(red[from]){//移動元の箱に赤いボールが入っている可能性があるかチェック
				red[to] = true;//移動元に赤いボールが入っている可能性がある場合は移動先に赤いボールが行く可能性があるのでTrueにする
			}

			box[from] -= 1;//fromの箱からボールを1個除く
			box[to] += 1;//toの箱にボールを1個足す

			if( box[from] == 0 ){//fromの箱のボールの数を確認
				red[from] = false;//fromの箱のボールの数が0個である場合は赤いボールが入っている可能性がなくなるのでfalseにする
			}
		}

		for( boolean flag:red){
			if(flag){
				ret += 1;
			}
		}
		System.out.println(ret);
	}

}
