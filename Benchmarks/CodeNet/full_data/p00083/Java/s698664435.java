import java.util.*;
import java.io.*;

class Date implements Comparable<Date> {

    final int year;
    final int month;
    final int day;

    Date( final int year, final int month, final int day ) {
	this.year = year;
	this.month = month;
	this.day = day;
    }

    public int compareTo( Date d ) {
	if ( year != d.year ) {
	    return Double.compare( year, d.year );
	} else if ( month != d.month ) {
	    return Double.compare( month, d.month );
	} else {
	    return Double.compare( day, d.day );
	}
    }    
}

class Main {

    public static void main( String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final Date[] change = { new Date( 1868, 9, 8 ), new Date( 1912, 7, 30 ),
				new Date( 1926, 12,25 ), new Date( 1989, 1, 8 ) };
	
	final String[] name = { "pre-meiji", "meiji", "taisho", "showa", "heisei" };
	
	while ( stdin.hasNextInt() ) {
	    final int year = stdin.nextInt();
	    final int month = stdin.nextInt();
	    final int day = stdin.nextInt();
	    final Date date = new Date( year, month, day );

	    int index = 0;
	    while ( index < change.length && date.compareTo( change[ index ] ) >= 0 ) {
		index++;
	    }
	    
	    if ( index == 0 ) {
		System.out.println( "pre-meiji" );
	    } else {
		final int yearNengo = date.year - change[ index - 1 ].year + 1;
		System.out.printf( "%s %d %d %d\n", name[ index ], yearNengo, month, day );
	    }
	}	
    }
    
}