import java.io.*;

class Dice {
	private int[] nums;
	public static final int DICEMAX = 6;
	public static final int TOP = 0;
	public static final int FRONT = 1;
	public static final int RIGHT = 2;
	public static final int LEFT = 3;
	public static final int BACK = 4;
	public static final int BOTTOM = 5;

	public static final int[] E = { TOP, LEFT, BOTTOM, RIGHT };
	public static final int[] N = { TOP, FRONT, BOTTOM, BACK };
	public static final int[] S = { TOP, BACK, BOTTOM, FRONT };
	public static final int[] W = { TOP, RIGHT, BOTTOM, LEFT };
	public static final int[] M = { FRONT, RIGHT, BACK, LEFT };
	public Dice( int nums[] ) {
		this.nums = new int[DICEMAX];
		for( int i=0; i<DICEMAX; i++ ) {
			this.nums[i] = nums[i];
		}
	}
	public int getDiceNum( int num ) {
		return this.nums[ num ];
	}
	public void toTop( int from ) {
		if( TOP == from ) {
			;
		} else if( FRONT == from ) {
			this.rotate( 'N' );
		} else if( RIGHT == from ) {
			this.rotate( 'W' );
		} else if( LEFT == from ) {
			this.rotate( 'E' );
		} else if( BACK == from ) {
			this.rotate( 'S' );
		} else if( BOTTOM == from ) {
			this.rotate( 'N' );
			this.rotate( 'N' );							
		}
		return;
	}

	public void rotate( char c ) {
		int tmp = 0;
		if( 'E' == c ) {
			tmp = this.nums[ E[0] ];
			for( int i=0; i<3; i++ ) {
				this.nums[ E[i] ] = this.nums[ E[i+1] ];
			}
			this.nums[ E[3] ] = tmp;
		} else if( 'N' == c ) {
			tmp = this.nums[ N[0] ];
			for( int i=0; i<3; i++ ) {
				this.nums[ N[i] ] = this.nums[ N[i+1] ];
			}
			this.nums[ N[3] ] = tmp;
		} else if( 'S' == c ) {
			tmp = this.nums[ S[0] ];
			for( int i=0; i<3; i++ ) {
				this.nums[ S[i] ] = this.nums[ S[i+1] ];
			}
			this.nums[ S[3] ] = tmp;
		} else if( 'W' == c ) {
			tmp = this.nums[ W[0] ];
			for( int i=0; i<3; i++ ) {
				this.nums[ W[i] ] = this.nums[ W[i+1] ];
			}
			this.nums[ W[3] ] = tmp;
		} else {
			tmp = this.nums[ M[0] ];
			for( int i=0; i<3; i++ ) {
				this.nums[ M[i] ] = this.nums[ M[i+1] ];
			}
			this.nums[ M[3] ] = tmp;
		
		}
		return;
	}
	
}

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			int[] nums = new int[ 6 ];
			int i;
			i = 0;
			for( String num:  kb.readLine().split( " " ) ) {
				nums[i++] = Integer.parseInt( num );
			}
			Dice dice = new Dice( nums );

			int q = Integer.parseInt( kb.readLine() );
			for( i=0; i<q; i++ ) {
				String[] strs = kb.readLine().split( " " );
				int[] topfront = new int[2];	
				for( int j=0; j<2; j++ ) {
					topfront[j] = Integer.parseInt( strs[j] );
				}
				for( int j=0; j<6; j++ ) {
					if( topfront[ dice.TOP ] == dice.getDiceNum( j ) ) {
						dice.toTop( j );
						while( topfront[ dice.FRONT ] != dice.getDiceNum( dice.FRONT ) ) {
							dice.rotate( 'M' );
						}
						break;
					}
				}
				System.out.println( dice.getDiceNum( dice.RIGHT ) );
			}

		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}