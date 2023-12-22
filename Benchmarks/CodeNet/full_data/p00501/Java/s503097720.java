import java.util.Scanner;

public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String data;						//看板に書かれている文字列。
		int N = sc.nextInt();				//看板の数。
		String name = sc.next();			//お店の名前。
		int i;								//制御用。
		int count = 0;						//お店の名前を作ることが出来る看板の数。
		for(i=0; i<N; i++){					//データセットを管理するループ。
			data = sc.next();
			
			B:for(int k=0; k <= (data.length() - name.length()); k++){	//『お店の名前の1文字目』を探す。
				String kanban = data.substring(k, k+1);
				String namae = name.substring(0, 0+1);
				if(kanban.equals(namae)){
					for(int m=k+1; m <= (data.length() - (name.length()-1)); m++){	//『お店の名前の2文字目』を探す。
						kanban = data.substring(m, m+1);
						namae = name.substring(1, 1+1);
						if(kanban.equals(namae)){		//2文字目が見つかったら、
							int dist = m-k;				//文字と文字の間の文字数を計算する。これを関数に渡す必要がある。
							
							for(int x = 1, y = m; x < name.length(); x++){
								if(x==name.length()-1){
									count++;
									break B;
								}
								else if(y+dist >= data.length()){
									break;
								}
								kanban = data.substring(y+dist, (y+dist)+1);
								namae = name.substring(x+1, (x+1)+1);
								if(kanban.equals(namae)){
									y+=dist;
								}
								else{
									break;
								}
								
							}
							
							/*-----関数を使う場合：
							
							if(check00(name, data, 1, m, dist)==1){
								count++;
								break B;		//一度、『作れる』と分かったら、それ以上調べる必要はないので、このデータセットを抜ける。
							}
							
							-----------------*/
							
						}
					}
				}
			}
		}
		System.out.println(count);
		return;
	}
	
	static int check00(String name, String data, int x, int y, int dist)
	{
		if(x==name.length()-1){
			return 1;
		}
		else if(y+dist >= data.length()){
			return 0;
		}
		String namae = name.substring((x+1), (x+1)+1);
		String kanban = data.substring((y+dist), (y+dist)+1);
		if(kanban.equals(namae)){
			return check00(name, data, x+1, y+dist, dist);
		}
		else{
			return 0;
		}
		
	}

}