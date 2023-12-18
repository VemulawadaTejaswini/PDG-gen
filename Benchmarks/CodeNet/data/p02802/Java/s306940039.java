import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W.split(" ")[0]);
		int M = Integer.parseInt(W.split(" ")[1]);

		int[][] P = new int[M][2];
		int ac = 0;
		int wa = 0;
		boolean flg = true;
		int befN = -1;

		for(int i=0;i<M;i++){
			W = in.readLine();
			String[] Ws = W.split(" ");
			int p0 = Integer.parseInt(Ws[0]);
			if(p0 != befN){
				flg = true;
				befN = p0;
			}
			//未正解の問題の場合
			if(flg){
				if("WA".equals(Ws[1])){
					wa++;
				}else{
					ac++;
					flg = false;
				}
			}
		}

		System.out.println(ac + " "+wa);
	}


}
