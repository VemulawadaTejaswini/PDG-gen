public class ITP1_9_D {


	/**与えられた命令の列を実行するプログラム
	 *
	 * @param args0:文字列、1:実行コマンド数 2~：コマンド
	 */
	public static void main(String[] args){


		String target = args[0];
		int set_num = Integer.parseInt(args[1]);

		for(int k = 0,  action = 0; action < set_num;action++){
			String command = args[k + 2];

			int start,end;
			start = Integer.parseInt(args[k + 3]);
			end = Integer.parseInt(args[k + 4]) + 1;		//なぜ＋１しないといかんのかわからん



			switch(command){
			case "print":
				//指定されたインデックス番号の位置から終端までの文字列を返します。
				System.out.println(target.substring(start,end));
				 k =k + 3;
				break;

			case "replace":
				StringBuffer sb = new StringBuffer(new String(target));
				//sb.replace(start, end, args[5]);
			//	System.out.println(sb.replace(start,end,args[k+5]));
				target = sb.replace(start, end, args[k + 5]).toString();
				k = k + 4;
				break;

			case "reverse":

				//リバースする部分をとりだして（変数１）、反転した変数をつくる（変数２）
				//もとの文章に対して,もとの文章.replace(変数１、変数２）をプリントアウト
				String target_part = target.substring(start ,end );						//変数１
				StringBuffer reverse_part = new StringBuffer(new String(target_part));	//変数２
				reverse_part.reverse();
			//	System.out.println(target.replace(target_part, reverse_part));
				target = target.replace(target_part, reverse_part);
				 k = k + 3;
				break;

			default:
				break;

			}
		}


	}
}

