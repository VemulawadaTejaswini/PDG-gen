import java.util.Scanner;

public class Main {


	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		String now_script = scan.next();

		char[] swap=null;							//対象の文字列を格納する変数
		int i = 0;
		for(int num= scan.nextInt();i <= num;i++){
			if(!(isInteger(now_script))){			//文字列である場合
				swap = now_script.toCharArray();
				now_script = scan.next();
			}else{									//数字の場合
				int getcard_num = Integer.parseInt(now_script);	//シャッフルするのに取り出す枚数

				swap = shuffle(swap , getcard_num);
				if(scan.hasNext("-")){				//最後の読み込み
					System.out.print(swap);
					break;
				}else if(!scan.hasNextInt()){		//次が数字じゃなかったら新しい文字列が入る準備をする
					i = -1;
					System.out.println(swap);
					swap = null;
					now_script = scan.next();
					num= scan.nextInt();
				}else{

					now_script = scan.next();		//それ以外は次の数字を読み込む
				}
			}

		}

		System.out.println();		//おまじない
	}

	/**
	 * 入力されたStringが文字列か数字かを判定
	 * @param num	判定する入力文字列
	 * @return	true:数字、false:文字列（数字以外の文字を含んでいる）
	 */
	static boolean isInteger(String num){

		try{
			int n = Integer.parseInt(num);
			return true;
		}catch(NumberFormatException e){
			return false;
		}

	}

	/**
	 * 下からとったカードを順番を変えずにそのまま上におく
	 * @param swap	カードの順番（文字列）
	 * @param b	取得する枚数
	 * @return
	 */
	public static char[] shuffle(char[] swap, int getcard_num){
		char[] tmp = new char[swap.length];
		//first
		for(int i = getcard_num ;i < swap.length; i++){

			tmp[i -getcard_num] = swap[i];	//h枚のカードをシャッフル後（tmp)の一番上にもってくる

		}

		//second
		for(int j = 0;j< getcard_num; j++){	//山札ーシャッフルで取り出した枚数（ｂ）
			tmp[j + swap.length - getcard_num] = swap[j];					//残った枚数をシャッフル後の後ろの方にもってくる
		}



		return tmp;
	}

}
