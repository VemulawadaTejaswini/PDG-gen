class Main{
	
	/**
	 * プログラムエントリポイント
	 * @param args
	 */
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//データセット回数を入力
		int setCountData = sc.nextInt();
		//入力されたデータセット回数分繰り返す
		for( int i = 0 ; i < setCountData ; i++ ){
			//繰り返す回数ごとに配列を作成して２次元配列の長さを入力
			char[][] aryBattleArea = new char[sc.nextInt()][sc.nextInt()];
			//配列aryBattleAreaに市街戦の要素入力
			for( int j = 0 ; j < aryBattleArea.length ; j++ ){
				aryBattleArea[j] = sc.next().toCharArray();
			}
			//繰り返す回数ごとに配列を作成して１次元配列の長さを入力
			char[] aryOperation = new char[sc.nextInt()];
			//配列aryOperationに操作分を入力したものを文字ごとに配列に格納
			aryOperation = sc.next().toCharArray();
			
			//BattleTownをインスタンス化
			BattleTown insBt = new BattleTown( aryBattleArea , aryOperation );
			
			aryBattleArea = insBt.runOperation();
			
			for( int x = 0 ; x < aryBattleArea.length ; x++ ){
				for( int y = 0 ; y < aryBattleArea[i].length ; y++ ){
					System.out.print(aryBattleArea[x][y]);
				}
				System.out.println();
			}
			
		}
	}
}

/**
 * 
 * 操作を実行する
 * @author SS-Internship01
 *
 */
class BattleTown{
	
	private char[][] aryBattleArea;
	private char[] aryOperation;
	
	/**
	 * コンストラクタ
	 * @param aryBattleArea 戦場を表す二次元配列
	 * @param aryOperation 命令を表す一次元配列
	 */
	public BattleTown(char[][] aryBattleArea , char[] aryOperation ){
		
		this.aryBattleArea = aryBattleArea;
		this.aryOperation = aryOperation;
		
	}
	
	/**
	 * 指定された操作を順番にactionTankクラス渡し
	 * 渡した操作は'0'にして読み取れないように
	 */
	public char[][] runOperation(){
		
		for( int k = 0 ; k < aryOperation.length ; k++ ){
			
			if( aryOperation[k] != '0' ){
			
				for( int i = 0 ; i < aryBattleArea.length ; i++ ){
					for( int j = 0 ; j < aryBattleArea[i].length ; j++ ){
						
						if( aryBattleArea[i][j] == '^' || aryBattleArea[i][j] == 'v' 
							|| aryBattleArea[i][j] == '<'|| aryBattleArea[i][j] == '>'){
							
								actionTank( i , j , aryOperation[k] );
								aryOperation[k] = '0';
								//runOperation();
								continue;
						}
					}
				}
			}
		}
		return aryBattleArea;
	}
	
	/**
	 * 指定された操作を実行する
	 * @param i 戦車を発見した配列の位置
	 * @param j 戦車を発見した配列の位置
	 * @param c 操作命令
	 */
	private void actionTank( int i , int j , char operation ) {
			
		//戦車上方向
		if( operation == 'U' ){
			
			aryBattleArea[i][j] = '^';
			
			if( i-1 >= 0 ){
				if( aryBattleArea[i-1][j] == '.' ){
					aryBattleArea[i][j] = '.';
					aryBattleArea[i-1][j] = '^';
				}
			}
				
		//戦車下方向
		}else if( operation == 'D' ){
			
			aryBattleArea[i][j] = 'v';
			
			if( i+1 < aryBattleArea.length ){
				if( aryBattleArea[i+1][j] == '.' ){
					aryBattleArea[i][j] = '.';
					aryBattleArea[i+1][j] = 'v';
				}
			}
			
		//戦車左方向
		}else if( operation == 'L' ){
			
			aryBattleArea[i][j] = '<';
			
			if( j-1 >= 0 ){
				if( aryBattleArea[i][j-1] == '.' ){
					aryBattleArea[i][j] = '.';
					aryBattleArea[i][j-1] = '<';
				}
			}
			
		//戦車右方向
		}else if( operation == 'R' ){
			
			aryBattleArea[i][j] = '>';
			
			if( j+1 < aryBattleArea[i].length ){
				if( aryBattleArea[i][j+1] == '.' ){
					aryBattleArea[i][j] = '.';
					aryBattleArea[i][j+1] = '>';
				}
			}
			
			
			
		}else if( operation == 'S' ){
		
			if(aryBattleArea[i][j] == '^'){
				
				for( int x = i ; x >= 0 ; x-- ){
					
					if( aryBattleArea[x][j] == '*' ){
						aryBattleArea[x][j] = '.';
						break;
					}else if( aryBattleArea[x][j] == '#' ){
						break;
					}
				}
				
			}else if(aryBattleArea[i][j] == 'v'){
				
				for( int x = i ; x < aryBattleArea.length ; x++ ){
					
					if( aryBattleArea[x][j] == '*' ){
						aryBattleArea[x][j] = '.';
						break;
					}else if( aryBattleArea[x][j] == '#' ){
						break;
					}
				}
				
			}else if(aryBattleArea[i][j] == '<'){
				
				for( int x = j ; x >= 0 ; x-- ){
					
					if( aryBattleArea[i][x] == '*' ){
						aryBattleArea[i][x] = '.';
						break;
					}else if( aryBattleArea[x][j] == '#' ){
						break;
					}
				}
				
			}else if(aryBattleArea[i][j] == '>'){
				
				for( int x = j ; x < aryBattleArea.length ; x++ ){
					
					if( aryBattleArea[i][x] == '*' ){
						aryBattleArea[i][x] = '.';
						break;
					}else if( aryBattleArea[x][j] == '#' ){
						break;
					}
				}
			}
		}
	}
}