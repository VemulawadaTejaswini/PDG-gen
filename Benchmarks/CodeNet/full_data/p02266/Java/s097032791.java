import java.io.UnsupportedEncodingException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String mark = scanner.next();
		int num = mark.length();
		
		SectionDiagram(mark, num, scanner);
		
	}
	//enum宣言
	public static enum Operate{
		back(92),
		slush(47),
		under(95);
		
		private final int mark;
		
		private Operate(final int mark) {
			this.mark = mark;
		}
		
		public int getInt(){
			return this.mark;
		}
	}
	public static Operate getOperate(final int id) {
		Operate[] marks = Operate.values();
		for (Operate type : marks) {
			if (type.getInt() == id) {
				return type;
			}
		}
		return null;
	}
	//治水シミュレーション
	public static void SectionDiagram(String mark, int num, Scanner scanner){
		int[] count_puddle = new int[num+5];	//"￥"が来たらそいつをカウント開始
		int[] puddle = new int[num+5];			//各水たまりの面積
		int sum_puddle_now = 0;						//今の水溜りの面積
		int sum_puddle = 0;						//水溜りの面積の合計
		int num_puddle = 0;						//水たまりの数
		int count = 0;							//Whileの周回
		int en_num = 0;							//カウントする￥の数
		int en_max = 0;							//深さ
		int i;
		byte[] mark_num = new byte[num];		//switch用格納庫
		
		try {
			mark_num = mark.getBytes("US-ASCII");
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		while( num > count ){										//文字数文処理
			
			
			switch( getOperate(mark_num[count]) ){					//
			case back:
				en_num ++;											//￥の数カウント
				break;
			case slush:
				en_num --;											//￥の数マイナス
				if( en_num < 0 ) {
					en_num = 0;
					break;
				}
				
				sum_puddle_now += count_puddle[en_num + 1];			//消した￥の面積を今の水たまりにする
				count_puddle[en_num + 1] = 0;						//それを初期化
				
				if ((en_num == 0) || ( count == num - 1)){			//今回の水たまりが確定
					sum_puddle += sum_puddle_now;					//今回の水たまりを全体に足す
					puddle[num_puddle] = sum_puddle_now;			//今回の水たまりを配列に入れる
					sum_puddle_now = 0;								//水たまり初期化
					sum_puddle_now = 0;								//水たまり初期化
					num_puddle ++;									//全体の水たまりの数を足す
				}
				break;
			case under:
				break;
			}
			//￥の数だけカウント
			for( i = 1; i <= en_num; i ++ ){
				count_puddle[i] += 1;
			}
			count ++;
		}
		if( en_num != 0 && sum_puddle_now > 0) {
			sum_puddle += sum_puddle_now;
			puddle[num_puddle] = sum_puddle_now;
			num_puddle ++;
		}
		
		//出力処理
		System.out.println(sum_puddle);	
		System.out.print(num_puddle);
		for( i = 0; i < num_puddle; i ++ ) {
			System.out.print(" " + puddle[i]);
		}
		System.out.println();
	}
}
