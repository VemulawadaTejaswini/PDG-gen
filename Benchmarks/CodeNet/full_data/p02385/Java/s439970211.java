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
	public void setDiceNums( int nums[] ) {
		for( int i=0; i<DICEMAX; i++ ) {
			this.nums[i] = nums[i];
		}
		return;
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
			int[] nums = new int[ Dice.DICEMAX ];
			int i, j;
			Dice[] dices = new Dice[2];
			for( i=0; i<2; i++ ) {
				j = 0;
				for( String num:  kb.readLine().split( " " ) ) {
					nums[j++] = Integer.parseInt( num );
				}
				dices[i] = new Dice( nums );
			}
			
			int isSame = 0;
			for( i=0; i<Dice.DICEMAX; i++ ) {
				if(  dices[0].getDiceNum( Dice.TOP ) == dices[1].getDiceNum( i ) ) {
					dices[1].toTop( i );
					isSame = 0;
					for( j=0; j<4; j++ ) {
						while( dices[0].getDiceNum( Dice.M[j] ) != dices[1].getDiceNum( Dice.FRONT ) ) {
							dices[1].rotate( 'M' );
							isSame++;
							if( 4 == isSame ) { break; }
						}
						if( isSame < 4 ) {
							for( isSame=0; isSame<Dice.DICEMAX ; isSame++ ) {
								if( dices[0].getDiceNum( isSame ) != dices[1].getDiceNum( isSame ) ) {
									break;
								}
							}
							if( Dice.DICEMAX == isSame ) { break; }
						}
					}
					if( Dice.DICEMAX == isSame ) { break; }
					dices[1].setDiceNums( nums );
				}
			}
			
				
			if( Dice.DICEMAX == isSame ) {
				System.out.println( "Yes" ); 
			} else {
				System.out.println( "No" ); 
			}

		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}