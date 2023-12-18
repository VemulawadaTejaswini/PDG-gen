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
		int N = Integer.parseInt(W);
		Data[] data = new Data[N];
		int ans = 1;
		for(int i=0;i<N;i++){
			W = in.readLine();

			String[] Ws = W.split(" ");
			int[] robo = new int[2];

			robo[0] = Integer.parseInt(Ws[0]);
			robo[1] = Integer.parseInt(Ws[1]);
			Data d = new Data(robo[0],robo[1]);
			data[i]=d;
		}

		//重複度と重複しているロボの記録
		Arrays.sort(data, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.ed - d2.ed;
            }
        });

		int last = 0;
		for(int i=1;i<N;i++){
			if(data[last].ed <=data[i].st){
				last=i;
				ans++;
			}
		}
		System.out.println(ans);



	}

	public static class Data implements Comparable<Data>{
		public int X =0;
		public int L =0;
		public int C =0;

		public int st;
		public int ed;

		public int dist ;
		public ArrayList<Data> robo = new ArrayList<Data> ();

		public Data(int X,int L){
			this.X=X;
			this.L=L;
			C=0;
			st = Math.max(0, X-L);
			ed = Math.min(1000000000, X+L);
			dist = ed-st;
		}

		@Override
		public int compareTo(Data o) {

			return o.C - this.C;
		}

	}

}
