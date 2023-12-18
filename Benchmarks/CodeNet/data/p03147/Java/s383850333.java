
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		str = br.readLine();
		String[] str2 = str.split(" ");
		ArrayList<Integer> h = new ArrayList<Integer>();
		for (int i=0; i < str2.length;i++){
			h.add(Integer.parseInt(str2[i]));
		}
		int ans = 0;
		//先頭の0をのぞく
		while(h.get(0)==0){
			h.remove(0);
		}
		//配列が空ならば終了
		while(!h.isEmpty()){
			//0が出てこなかったらidxを末端にする
			int endidx = h.size();
			int min=1000;	
			//minの取得
			for (int i=0; i<h.size(); i++){
				int hi=h.get(i);
				//0が出てきたらそこまで
				if (hi==0){
					endidx=i;
					break;
				}
				//0でなければminを更新
				if(min>hi){
					min = hi;
				}
			}
			//minをもちいて配列の更新
			//endidxの要素(値は0)の一つ前まで操作
			for (int i=0; i < endidx;i++){
				h.set(i,h.get(i)-min);
			}
			//ansの更新
			ans += min;
			//先頭の0をのぞく
			while(h.get(0)==0){
				h.remove(0);
				if(h.isEmpty()){
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
