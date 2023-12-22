import java.util.Scanner;


public class Main {

	static void init_array ( int[][] array ) {

		for ( int i = 0 ; i < array.length ; i++ ) {
			for( int j = 0 ; j < array[i].length ; j++ ) {
				array[i][j] = 0;
			}
		}
	}

	static void check_island ( int[][] map, int[][] serch_map, int serch_x, int serch_y ) {

		// その島の土地と面する海をサーチ済みにする

		int serch_cnt = 1;
		int[] serch_point_x= new int[70];
		int[] serch_point_y= new int[70];
		int[][] serch_stack_on = new int[14][14];
		int x,y;

		init_array ( serch_stack_on );

		serch_stack_on[serch_x][serch_y] = 1;

		while ( true ) {

			serch_cnt--;

			//右下左上（0123）の連続した土地をサーチ
			//未サーチの連続した土地をサーチポイントとしてスタックし
			//その土地がなくなるまで繰り返す
			//サーチポイントが重複しないようserch_stack_onで管理

			for ( int i = 0 ; i < 4 ; i++ ) {

				x = serch_x;
				y = serch_y;

				switch(i){
				case 0:
					x++;
					break;
				case 1:
					y++;
					break;
				case 2:
					x--;
					break;
				case 3:
					y--;
					break;
				}

				if ( serch_map[x][y] == 0 ) {
					if ( map[x][y] == 1 ) {
						if ( serch_stack_on[x][y] == 0 ) {
							serch_cnt++;
							serch_point_x[serch_cnt] = x;
							serch_point_y[serch_cnt] = y;
							serch_stack_on[x][y] = 1;
						}
					} else {
						serch_map[x][y] = 1;
					}
				}
			}

			//サーチ完了
			serch_stack_on[serch_x][serch_y]=0;
			serch_map[serch_x][serch_y] = 1;

			if ( serch_cnt == 0 ) {
				break;
			}

			serch_x = serch_point_x[serch_cnt];
			serch_y = serch_point_y[serch_cnt];

		}
	}

	public static void main(String[] args) {

		//島の数
		int island_num;
		String[] str_buf = new String[12];

		Scanner sc= new Scanner( System.in );

		int[][] map = new int[14][14];
		//サーチ状態　未:0　済:1
		int[][] serch_map = new int[14][14];

		while( sc.hasNext() ) {

			//データセット（数字）読み込み
			for ( int i = 0 ; i < 12 ; i++ ) {
				str_buf[i] =sc.next();
			}

			//初期化
			island_num = 0;
			init_array( serch_map );

			//mapセット mapを0で囲む serch_mapを1で囲む
			for ( int i = 0 ; i < map.length ; i++ ) {
				for ( int j = 0 ; j < map[i].length ; j++ ) {
					if( ( (i+1) % (map.length-1) ) == 1 || ( (j+1) % (map[i].length-1) ) == 1 ) {
						map[i][j]=0;
						serch_map[i][j]=1;
					}else {
						map[i][j]=Integer.parseInt( "" + str_buf[i-1].charAt( j-1 ) );
					}
				}
			}

			//サーチ処理
			for ( int i = 1 ; i < serch_map.length-1 ; i++ ) {
				for ( int j = 1 ; j < serch_map.length-1 ; j ++) {
					//未サーチの土地を発見時、島の数+1
					if( serch_map[i][j] == 0) {
						if( map[i][j] == 1 ) {
							island_num++;
							check_island( map, serch_map , i, j );
						} else {
							serch_map[i][j] = 1;
						}
					}
				}
			}

			System.out.println( island_num );

		}
		sc.close();
	}
}
