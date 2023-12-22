import java.util.Scanner;

//6/13
public class Main {


	/**与えられた命令の列を実行するプログラム
	 *
	 * @param args0:文字列、1:実行コマンド数 2~：コマンド
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		String target = scan.next();
		int set_num = scan.nextInt();
//		String target = args[0];
//		int set_num = Integer.parseInt(args[1]);

		for(int k = 0,  action = 0; action < set_num;action++){
			String command = scan.next();
//			String command = args[k + 2];

			int start,end;
			start = scan.nextInt();
			end = scan.nextInt() + 1;						//なぜ＋１しないといかんのかわからん
//			start = Integer.parseInt(args[k + 3]);
//			end = Integer.parseInt(args[k + 4]) + 1;		//なぜ＋１しないといかんのかわからん



			switch(command){
			case "print":
				//指定されたインデックス番号の位置から終端までの文字列を返します。
				System.out.println(target.substring(start,end));
				 k =k + 3;
				break;

			case "replace":
				StringBuffer sb = new StringBuffer(new String(target));
				
				target = sb.replace(start, end, scan.next()).toString();
				k = k + 4;
				break;

			case "reverse":

				//リバースする部分をとりだして（変数１）、反転した変数をつくる（変数２）
				//もとの文章に対して,もとの文章.replace(変数１、変数２）をプリントアウト
				String target_part = target.substring(start ,end );						//変数１
				StringBuffer reverse_part = new StringBuffer(new String(target_part));	//変数２
				
				reverse_part.reverse();
				target = target.replace(target_part, reverse_part);
				 k = k + 3;
				break;

			default:
				break;

			}
		}


	}
}

