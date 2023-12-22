import java.util.Scanner;

public class Main{
	Scanner sc;
	int INF = 1<<27;
	
	int[][] dp;
	int[][][][] map;
	int x, y;
	boolean done[][];
	
	void run(){
		sc = new Scanner(System.in);
		
		while(true){
			x = ni();
			y = ni();
			if( (x|y) == 0 ){
				break;
			}
			dp = new int[x*y+1][3];
			map = new int[x*y+1][3][y][x];
			
			for( int i = 0; i < x*y+1; ++i ){
				for( int j = 0; j < 3; ++j ){
					dp[ i ][ j ] = INF;
					map[ i ][ j ][ 0 ][ 0 ] = -1;
				}
			}
			
			for( int i = 0; i < y; ++i ){
				for( int j = 0; j < x; ++j ){
					int c = nc();
					for( int k =0; k < 3; ++k ){
						map[ 0 ][ k ][ i ][ j ] = c;
					}
				}
			}
			
			done = new boolean[y][x];
			int cnt = count( 0, map[0][0][0][0], 0, 0 );
			dp[ cnt ][ map[0][0][0][0] ] = 0;
			for( int i = 0; i < y; ++i ){
				for( int j = 0; j < x; ++j ){
					map[ cnt ][ map[0][0][0][0] ][ i ][ j ] = map[0][0][i][j];
				}
			}
			
			for( int i = 1; i < x*y; ++i ){
				for( int j = 0; j < 3; ++j ){
					if( map[ i ][ j ][ 0 ][ 0 ] == -1 ) continue;
					
					for( int k = 0; k < 3; ++k ){
						if( j == k ) continue;
						
						done = new boolean[y][x];
						int res = count( i, j, 0, 0, k, false );
						assert( res > i );
						
						for( int y_ = 0; y_ < y; ++y_ ){
							for( int x_ = 0; x_ < x; ++x_){
								map[ res ][ k ][ y_ ][ x_ ] = map[ i ][ j ][ y_ ][ x_ ];
							}
						}
						
						done = new boolean[y][x];
						fill( res, k, 0, 0, j );
						
						dp[ res ][ k ] = Math.min( dp[ res ][ k ], dp[ i ][ j ] + 1 );
					}
				}
			}
			
			int ans = INF;
			for( int i = 0; i < 3; ++i ){
				ans = Math.min( ans, dp[ x*y ][ i ] );
			}
			
			System.out.println(ans);
		}
		
		sc.close();
	}
	
	int[][] ofs = { {0,1}, {1,0} };
	int count( int state, int color, int y, int x ){
		if( x >= this.x || y >= this.y )return 0;
		if(done[y][x])return 0;
		done[y][x] = true;
		
		int cnt = 0;
		if( map[state][color][y][x] == color ){
			++cnt;
			for( int i = 0; i < 2; ++i ){
				cnt += count( state, color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ] );
			}			
		}
		
		return cnt;
	}
	int count( int state, int color, int y, int x, int trg, boolean flag ){
		if( x >= this.x || y >= this.y )return 0;
		if(done[y][x])return 0;
		done[y][x] = true;
		
		int cnt = 0;
		if( !flag && map[state][color][y][x] == color ){
			++cnt;
			for( int i = 0; i < 2; ++i ){
				cnt += count( state, color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ], trg, false );
			}			
		}else{
			if( map[state][color][y][x] == trg ){
				++cnt;
				for( int i = 0; i < 2; ++i){
					cnt += count( state, color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ], trg, true );
				}
			}
		}
		
		return cnt;
	}
	
	void fill( int state, int color, int y, int x, int trg ){
		if( x >= this.x || y >= this.y )return;
		if(done[y][x])return;
		done[y][x] = true;
		
		if(map[state][color][y][x] == trg){
			map[state][color][y][x] = color;
			
			for( int i = 0; i < 2; ++i ){
				fill( state, color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ], trg );
			}
		}
	}
	
	int ni(){ return sc.nextInt(); }
	int nc(){
		switch(sc.next().charAt(0)){
		case 'R' : return 0;
		case 'G' : return 1;
		case 'B' : return 2;
		default : return -1;
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
}