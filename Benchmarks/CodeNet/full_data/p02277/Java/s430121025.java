import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	private static	int num;
	private static	card[]  array;
	
	public static void main(String args[]) {
		//実行処理
		try {
			run();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	//実質メイン
	public static void run() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		array = new card[num];
		//配列作成
		for (int i = 0;i < num;i ++){
            String[] ope = br.readLine().split(" ");
            array[i] = new card(ope[0],Integer.parseInt(ope[1]),i);
        }
		//ソート処理
		quicksort(0, num - 1 );
		//出力
		String message = "Stable";
        for (int i = 0; i < num - 1; i ++){
            if(array[i].num == array[i+1].num && array[i].index > array[i + 1].index){
                message = "Not stable";
                break;
            }
        }
		System.out.println(message);
		output();
		//後処理
		br.close();
	}
	
	//クイックソート
	public static void quicksort(int par, int rim){
		int q;
		if ( par < rim ){
			q = partition(par, rim);
			quicksort(par, q - 1);
			quicksort(q + 1, rim);
		}
	}
	
	//パーティション
	public static int partition(int par,int rim){
		card work;
		int x = array[rim].num;
		int i = par - 1;
		//ソート処理
		for (int j = par ; j < rim ; j ++ ){
			if ( array[j].num <= x ) {
				work = array[++i];
				array[i] = array[j];
				array[j] = work;
			}
		}
		//最後に入れ替え
		work = array[++i];
		array[i] = array[rim];
		array[rim] = work;
		return i;
	}
	
	//出力
	public static void output(){
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < num; i++) {
			sb.append(array[i].mark).append(" " + array[i].num).append("\n"); 
		}
		System.out.print(sb);
	}
	
}
//class宣言
class card{
    String mark;
    int num,index;
    public card(String mark,int num,int index){
        this.mark = mark;
        this.num = num;
        this.index = index;
	}
}
