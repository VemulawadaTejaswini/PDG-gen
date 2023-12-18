import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);
		int Q = Integer.parseInt(Ws[1]);

		long[] p = new long[N];
		Arrays.fill(p, 0);
		ArrayList<int[]> link = new ArrayList<int[]>();

		for(int i=0;i<N-1;i++){
			W = in.readLine();
			Ws = W.split(" ");
			int[] tmp = new int[2];
			tmp[0] = Integer.parseInt(Ws[0])-1;
			tmp[1] = Integer.parseInt(Ws[1])-1;
			link.add(tmp);
		}

		link.sort(new Comparator<int[]>(){
			public int compare(int[] a , int[] b){
				return a[1] - b[1];
			}
		});


		//各頂点に指定された点数を加算
		for(int i=0;i<Q;i++){
			W = in.readLine();
			Ws = W.split(" ");
			p[Integer.parseInt(Ws[0])-1]+=Integer.parseInt(Ws[1]);
		}

		StringBuffer sb = new StringBuffer();
		//頂点１については自分の数値のみのため、そのまま出力
		sb.append(p[0]+" ");
		//各頂点を２から順に出力する
		for(int i=1;i<N;i++){
			p[i]+=p[link.get(i-1)[0]];
			sb.append(p[i]+" ");
		}
		sb.delete(sb.length()-1, sb.length());
		System.out.println(sb.toString());

	}




}
