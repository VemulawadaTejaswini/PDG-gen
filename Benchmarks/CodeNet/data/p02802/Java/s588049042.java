import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W.split(" ")[0]);
		int M = Integer.parseInt(W.split(" ")[1]);

		int ac = 0;
		int wa = 0;
		int tmpAc = 0;
		int tmpWa = 0;

		boolean flg = true;
		int befN = -1;

		for(int i=0;i<M;i++){
			W = in.readLine();
			String[] Ws = W.split(" ");
			int p0 = Integer.parseInt(Ws[0]);
			if(p0 != befN){
				if(flg == false){
					wa+=tmpWa;
					ac+=tmpAc;
				}
				flg = true;
				befN = p0;
				tmpWa=0;
				tmpAc=0;
			}
			//未正解の問題の場合
			if(flg){
				if("WA".equals(Ws[1])){
					tmpWa++;
				}else{
					tmpAc++;
					flg = false;
				}
			}
		}

		if(flg == false){
			wa+=tmpWa;
			ac+=tmpAc;
		}


		System.out.println(ac + " "+wa);
	}


}
