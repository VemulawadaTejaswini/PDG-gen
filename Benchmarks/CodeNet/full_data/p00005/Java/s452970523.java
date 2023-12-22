import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		String		str;
		int a,b,multiple = 0,divisor = 0;
		ArrayList<String>	list	= new ArrayList<String>();
		ArrayList<Integer>	intList	= new ArrayList<Integer>();
		try {
			BufferedReader br	=	new BufferedReader(new InputStreamReader(System.in));
			while((str=br.readLine())!=null){
				list.add(str);						//行単位でArrayListに追加
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(int i=0; i<list.size(); i++){			//一行文のデータ毎に処理する
			String[] s = list.get(i).split(" ");	//listの要素を空白で区切って配列を作成
			for(int j=0; j<s.length; j++){			//int型に変換してArrayListに追加
				intList.add(Integer.parseInt(s[j]));
			}
			Collections.sort(intList);				//小さい順に並べる

			a = intList.get(0);						//a,bを決める。a<bとなっている。
			b = intList.get(1);
			
			//最大公約数を求める
			divisor = getDivisor(a,b);

			//最小公倍数を求める
			multiple = getMultiple(a,b);
			
			//結果の表示
			System.out.println(divisor + " " + multiple);
			
			intList.clear();						//リストのクリア
		}
	}
	
	//最大公約数を求めるメソッド
	static int getDivisor(int x, int y){
		if(x%y==0){
			return y;
		}else{
			int m = 1;
			while(m!=0){
				m = y%x;
				y = x;
				x = m;
			}
			return y;
		}
	}
	//最小公倍数を求めるメソッド
	static int getMultiple(int x, int y){
		for(int i=1; i<=x; i++){
			if(y*i%x==0){
				return y*i;
			}
		}
		return 0;
	}
}