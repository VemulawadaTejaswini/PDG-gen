import java.util.Scanner;

public class Main {

	static void init_array ( int[][] array ) {

		for ( int i = 0 ; i < array.length ; i++ ) {
			for( int j = 0 ; j < array[i].length ; j++ ) {
				array[i][j] = 0;
			}
		}
	}

	static void set_card_num ( int[] card_num, String[] card_color, int[][] card ) {

		int color = 0;

		for ( int i = 0 ; i < card_num.length ; i++ ) {
			switch( card_color[i] ) {
			case"R":
				color = 0;
				break;
			case"G":
				color = 1;
				break;
			case"B":
				color = 2;
				break;
			}

			card[color][card_num[i]]++;
			card[color][0]++;
		}
	}

	static boolean judge ( int[][] card ) {

		boolean judge = true;

		for ( int i = 0 ; i < card.length ; i++ ) {
			if( ( card[i][0] ) != 0 && judge ) {
				//同色のカードの合計が3の倍数でないとき3枚セットがつくれないので【敗北】
				if ( card[i][0] % 3 != 0 ) {
					judge = false;
				}
				if( judge ) {
					for( int j = 1 ; j <  card[i].length ; j++ ) {
						if ( judge ) {
							//対象の数字のカードの枚数がマイナスの時は連番のセット作成失敗【敗北】
							if( card[i][j] < 0 ) {
								judge = false;
							//対象の数字のカードの枚数が1枚以上の時は、3枚の組み合わせを作って捨てる
							} else	if( card[i][j] > 0 ) {
								//対象の数字のカードの枚数が3枚以上の時、同じ数字3枚の組み合わせのカードを捨てる
								//同じカードは5枚までのため、残り枚数は0,1,2のいずれかになる
								if( card[i][j] >= 3 ) {
									card[i][j] -= 3;
								}
								//対象の数字のカードの枚数が1,2の時連番のカードを作成して捨てる
								//ただし、数字が8と9の時は連番は作成できない（カードが余る）ので【敗北】
								//（数字が8と9の時の同じ数字3枚の組み合わせは既に捨てている）
								if ( card[i][j] != 0 ) {
									if( j == ( card[i].length - 1 ) || j == ( card[i].length - 2 ) ) {
										judge = false;
									} else {
										//対象の数字のカードの枚数分、連番の対象となる数字のカードを捨てる
										//最小値から順番に連番を作成してカードを捨てるため、
										//作成に成功した時、連番の対象となる数字のカードの枚数は0以上になる
										//（同じ数字3枚の組み合わせは既に捨てている）
										card[i][j+2] -= card[i][j];
										card[i][j+1] -= card[i][j];

										//チェック用処理
										//card[i][j] = 0;
									}
								}
							}
						}
					}
				}
			}
		}
		return judge;
	}

	static void judge_output ( boolean judge ) {
		if ( judge ) {
			System.out.println( "1" );
		} else {
		System.out.println( "0" );
		}
	}

	public static void main(String[] args) {

		//勝敗判定 true 勝利 false 敗北
		boolean win_match;
		//データセット数
		int set_num = 0;
		//手持ちのカード数
		int num_of_onhand = 9;
		//カードの数字の最大値
		int card_num_max = 9;
		//色の種類の数
		//色に対応した数字 R=0,G=1,B=2
		int color_num = 3;

		//1つのデータセットのカードの数字 配列nは手持ちn枚目
		int[] input_card_num = new int [num_of_onhand];
		//1つのデータセットのカードの色 配列nは手持ちn枚目
		String[] input_card_color = new String [num_of_onhand];

		//ある色の数字のカード枚数 R1の枚数が1枚 card[0][1]=1;
		//ただし数字0は1つのデータセットの同色の合計数 Rの合計数3枚 card[0][0]=3;
		int[][] card = new int[color_num][card_num_max+1];

		Scanner sc= new Scanner( System.in );

		//データセット数読み込み
		set_num = sc.nextInt();

		//データセットの回数、処理実行
		for ( int i = 0 ; i < set_num ; i++ ) {

			//初期化
			win_match = true;
			init_array ( card );

			//データセット（数字）読み込み
			for ( int j = 0 ; j < num_of_onhand ; j++ ) {
				input_card_num[j] = sc.nextInt();
			}

			//データセット（色）読み込み
			for ( int j = 0 ; j < num_of_onhand ; j++ ) {
				input_card_color[j] = sc.next();
			}

			//データセットを元に色と数字に対応したカードの枚数をセット
			//同色の合計枚数をセット
			set_card_num( input_card_num, input_card_color, card );

			//勝敗判定 true 勝利 false 敗北
			//敗北条件を判定し、一つでも一致したら敗北とみなす
			win_match = judge( card );

			//結果出力
			judge_output ( win_match );

		}
		sc.close();
	}
}

