import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextLine() ) {

	    final String[] input = stdin.nextLine().split( "," );

	    int[] hand = new int[5];
	    for ( int i = 0; i < 5; i++ ) {
		hand[i] = Integer.parseInt( input[i] );
		if ( hand[i] == 1 ) {
		    hand[i] = 14;
		}
	    }

	    Arrays.sort( hand );
	    if ( isFourCard( hand ) ) {
		System.out.println( "four card" );
	    } else if ( isFullHouse( hand ) ) {
		System.out.println( "full house" );
	    } else if ( isStraight( hand ) ) {
		System.out.println( "straight" );
	    } else if ( isThreeCard( hand ) ) {
		System.out.println( "three card" );
	    } else if ( isTwoPair( hand ) ) {
		System.out.println( "two pair" );
	    } else if ( isOnePair( hand ) ) {
		System.out.println( "one pair" );
	    } else {
		System.out.println( "null" );
	    }
	}	
    }

    static int getDuplicateOf( int[] hands, int noOfDup ) {
	int ans = 0;
	
	int index = 0;
	while ( index < hands.length ) {
	    int no = hands[index];
	    int counter = 0;
	    while ( index < hands.length && no == hands[index] ) {
		counter++;
		index++;
	    }
	    if ( counter == noOfDup ) {
		ans++;
	    }
	}
	return ans;
    }

    static boolean isOnePair( int[] hand ) {
	return getDuplicateOf( hand, 2 ) == 1;
    }

    static boolean isTwoPair( int[] hand ) {
	return getDuplicateOf( hand, 2 ) == 2;
    }

    static boolean isThreeCard( int[] hand ) {
	return getDuplicateOf( hand, 3 ) == 1;
    }

    static boolean isFullHouse( int[] hand ) {
	return getDuplicateOf( hand, 2 ) == 1 &&
	    getDuplicateOf( hand, 3 ) == 1;
    }

    static boolean isFourCard( int[] hand ) {
	return getDuplicateOf( hand, 4 ) == 1;
    }

    static boolean isStraight( int[] hand ) {
	if ( hand[0] == 2 && hand[1] == 3 && hand[2] == 4 && hand[3] == 5 && hand[4] == 14 ) {
	    return true;
	} else if ( 2 <= hand[0] && hand[0] <= 10 ) {
	    for ( int i = 0; i < 5; i++ ) {
		if ( hand[i] != hand[0] + i ) {
		    return false;
		}
	    }
	    return true;
	} else {
	    return false;
	}	   
    }
}