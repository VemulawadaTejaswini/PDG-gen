//AOJ BattleTown

import java.util.ArrayList;
import java.util.Scanner;

class Main{
    
    /**
     * プログラムエントリポイント
     * @param args
     */
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<char[][]> listBattleArea = new ArrayList<char[][]>();
        
        //データセット回数を入力
        int setCountData = sc.nextInt();
        
        //入力されたデータセット回数分繰り返す
        for( int i = 0 ; i < setCountData ; i++ ){
        	
        	int aryCountNum1 = sc.nextInt();
        	int aryCountNum2 = sc.nextInt();
        	
            //繰り返す回数ごとに配列を作成
            char[][] aryBattleArea = new char[aryCountNum1][aryCountNum2];
            
            //配列aryBattleAreaに市街戦の要素入力
            for( int j = 0 ; j < aryBattleArea.length ; j++ ){
            	
                aryBattleArea[j] = sc.next().toCharArray();
                
            }
            
            int intOperationLength = sc.nextInt();
            
            //繰り返す回数ごとに配列を作成
            char[] aryOperation = new char[intOperationLength];
            
            //配列aryOperationに操作分を入力したものを文字ごとに配列に格納
            aryOperation = sc.next().toCharArray();
            
            //BattleTownをインスタンス化
            BattleTown insBt = new BattleTown( aryBattleArea , aryOperation );
            
            aryBattleArea = insBt.runOperation();
            
            listBattleArea.add(aryBattleArea);
            
        }
        
        for( int i = 0 ; i < listBattleArea.size() ; i++ ){
        	
        	char[][] output = listBattleArea.get(i);
        	
        	for( int j = 0 ; j < output.length ; j++ ){
        		for( int k = 0 ; k < output[j].length ; k++ ){
        			
        			System.out.print(output[j][k]);
        			
        		}
        		System.out.println();
        	}
        	if( i != listBattleArea.size()-1)
        	System.out.println();
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
                                break;
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
	private void actionTank(int tankI, int tankJ, char operation) {
		
		char[] sousa =         { 'U' ,  'D' ,  'R' , 'L' };
    	char[] muki =          { '^' ,  'v' ,  '>' , '<' };
    	int[][] susumikata =  {{-1,0},{+1,0},{0,+1},{0,-1}};
    	
    	
    	if( operation != 'S'){
    		
    		int Seigen1 = 0;
        	int Seigen2 = 0;
    		
    		for( int i = 0 ; i < sousa.length ; i++ ){
    			if( operation == sousa[i]){
    				
    				aryBattleArea[tankI][tankJ] = muki[i];
    				
    				if( operation == 'U' ){Seigen1 = tankI-1; Seigen2 = 0;};
    				if( operation == 'D' ){Seigen1 = aryBattleArea.length-1; Seigen2 = tankI+1;};
    				if( operation == 'R' ){Seigen1 = aryBattleArea[tankI].length-1; Seigen2 = tankJ+1;};
    				if( operation == 'L' ){Seigen1 = tankJ-1; Seigen2 = 0;};
    				
    				//if( 0 <= tankI && tankI < aryBattleArea.length   &&   0 <= tankJ && tankJ < aryBattleArea[tankI].length){
    				if( Seigen1 >= Seigen2){
    	                if( aryBattleArea[ tankI + susumikata[i][0] ][ tankJ + susumikata[i][1] ] == '.' ){
    	                	
    	                    aryBattleArea[ tankI ][ tankJ ] = '.';
    	                    aryBattleArea[ tankI + susumikata[i][0] ][ tankJ + susumikata[i][1] ] = muki[i];
    	                    
    	                }
    				}
    				
    			}
    		}
    		
    	}else if(operation == 'S'){
    		
    		int TI = tankI;
    		int TJ = tankJ;
    		//int Seigen1 = 0;
        	//int Seigen2 = 0;
    		
    		for( int i = 0 ; i < muki.length ; i++ ){
    			
    			if( aryBattleArea[TI][TJ] == muki[i]){
    				
    				//if( operation == 'U' ){Seigen1 = TI; Seigen2 = 0;};
    				//if( operation == 'D' ){Seigen1 = aryBattleArea.length-1; Seigen2 = TI;};
    				//if( operation == 'R' ){Seigen1 = aryBattleArea[TI].length-1; Seigen2 = TJ;};
    				//if( operation == 'L' ){Seigen1 = TJ; Seigen2 = 0;};
    		
    				//while(Seigen1 >= Seigen2){
    				while( 0 <= TI && TI < aryBattleArea.length   &&   0 <= TJ && TJ < aryBattleArea[TI].length){
            	
    					if(aryBattleArea[ TI ][ TJ  ]=='*'){
    						aryBattleArea[ TI ][ TJ  ] = '.';
    						break;
    					}else if(aryBattleArea[ TI ][ TJ ]=='#'){
    						break;
    					}
    					
    					TI += susumikata[i][0];
    					TJ += susumikata[i][1];
    				}
    				break;
    			}
    		}
    		
    		
    		
    		/*
            if(aryBattleArea[tankI][tankJ] == '^'){
                
                for( int x = tankI ; x >= 0 ; x-- ){
                    
                    if( aryBattleArea[x][tankJ] == '*' ){
                        aryBattleArea[x][tankJ] = '.';
                        break;
                    }else if( aryBattleArea[x][tankJ] == '#' ){
                        break;
                    }
                }
                
            }else if(aryBattleArea[tankI][tankJ] == 'v'){
                
                for( int x = tankI ; x < aryBattleArea.length ; x++ ){
                    
                    if( aryBattleArea[x][tankJ] == '*' ){
                        aryBattleArea[x][tankJ] = '.';
                        break;
                    }else if( aryBattleArea[x][tankJ] == '#' ){
                        break;
                    }
                }
                
            }else if(aryBattleArea[tankI][tankJ] == '<'){
                
                for( int x = tankJ ; x >= 0 ; x-- ){
                    
                    if( aryBattleArea[tankI][x] == '*' ){
                        aryBattleArea[tankI][x] = '.';
                        break;
                    }else if( aryBattleArea[tankI][x] == '#' ){
                        break;
                    }
                }
                
            }else if(aryBattleArea[tankI][tankJ] == '>'){
                
                for( int x = tankJ ; x < aryBattleArea[tankI].length ; x++ ){
                    
                    if( aryBattleArea[tankI][x] == '*' ){
                        aryBattleArea[tankI][x] = '.';
                        break;
                    }else if( aryBattleArea[tankI][x] == '#' ){
                        break;
                    }
                }
            }*/
    		
    		
    		
    	}
	}	
}