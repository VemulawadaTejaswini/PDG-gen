import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		String str;
		int a,b,c;
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			while((str = br.readLine())!=null){
				list1.add(str);		//とりあえず全部ArrayListに入れる
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=1; i<list1.size(); i++){
			String[] numbers = list1.get(i).split(" "); //空白で区切って配列作成
			for(String s : numbers){					//ArrayListに入れる
				list2.add(Integer.parseInt(s));
			}
			Collections.sort(list2);					//小さい順に並べる
			Collections.reverse(list2);					//逆順に並べる

			a	=	list2.get(0);						//要素を辺の長さとする。aは斜辺となる。
			b	=	list2.get(1);
			c	=	list2.get(2);
			
			
			if(a*a==b*b + c*c){							//判定
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			list2.clear();
		}
	}
}