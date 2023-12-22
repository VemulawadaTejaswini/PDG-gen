import java.io.*;

class Card {
	char suit;
	int value;
	int order;
	
	public Card( char suit, int value, int order )
	{
		this.suit = suit;
		this.value = value;
		this.order = order;
	
		return;
	}
}

class Main {
	
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );
			String[] nums = kb.readLine().split( " " );
			Card[] cards = new Card[n];
            int i, j;
            
            for( i=0; i<n; i++ ) {
            	cards[i] = new Card( nums[i].charAt( 0 ) , Integer.parseInt( nums[i].substring( 1, 2 ) ), i );
            }
			Card[] savecards = cards.clone();
			Card[] clonecards = cards.clone();
			
			bubbleSort( cards );
			
            StringBuilder output = new StringBuilder( 200+1 );
            for( i=0; i<n; i++ ) {
            	output.append( cards[i].suit  );
            	output.append( cards[i].value  );
            	output.append( " "  );
            }
            output.deleteCharAt( output.lastIndexOf( " " ) );
            System.out.println( output );
            System.out.println( "Stable" );
            

			selectionSort( clonecards );
			
           output.setLength( 0 ); 
           for( i=0; i<n; i++ ) {
            	output.append( clonecards[i].suit  );
            	output.append( clonecards[i].value  );
            	output.append( " "  );
            }
            output.deleteCharAt( output.lastIndexOf( " " ) );

            System.out.println( output );
            
            boolean istable = true;
           for( i=0; i<n && istable; i++ ) {
	           for( j=0; j<n; j++ ) {
	            	if( savecards[j].value == clonecards[i].value ) {
	            		if( savecards[j].suit == clonecards[i].suit ) {
	            			break;
	            		} else if( savecards[j].suit < clonecards[i].suit ) {
	            			istable = false;
	            			break;
	            		}
	            	}
            	}
            }
            
            if( istable ) {
            	System.out.println( "Stable" );
            } else {
            	System.out.println( "Not stable" );
            }
	 
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }        
    }
    static void bubbleSort( Card[] A ) 
    {
        Card tmp;
        int i, j;
        int n = A.length;

        for( i=0; i<n; i++ ) {
            for( j=n-1; i<j; j-- ) {
                if( A[j].value < A[ j-1 ].value ) {
                    tmp = A[ j-1 ];
                    A[ j-1 ] = A[ j ];
                    A[ j ] = tmp;
                }
            }
        }
        return;
    }    
    static void selectionSort( Card[] A ) 
    {
    	Card tmp;
    	int i, j, mini;
    	int n = A.length;

   		for( i=0; i<n; i++ ) {
   			mini = i;
   			for( j=i; j<n; j++ ) {
   				if( A[j].value < A[ mini ].value ) {
   					mini = j;
   				}
   			}
   			if( mini != i ) {
		   		tmp = A[ mini ];
				A[ mini ] = A[ i ];
				A[ i ] = tmp;
			}
   		}
   		return;
    }
}