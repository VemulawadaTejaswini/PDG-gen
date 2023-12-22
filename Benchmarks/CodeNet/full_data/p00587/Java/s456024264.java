import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Element {

    static final Element NONE = new Element( null, null );

    final Element left;
    final Element right;

    Element(){
	this.left = NONE;
	this.right = NONE;
    };

    Element( Element left, Element right ) {
	this.left = left;
	this.right = right;
    }

    Element intersection( Element e ) {
	if ( this == NONE || e == NONE ) {
	    return NONE;
	} else {
	    final Element interLeft = left.intersection( e.left );
	    final Element interRight = right.intersection( e.right );
	    return new Element( interLeft, interRight );
	}	    
    }

    Element union( Element e ) {
	if ( this == NONE ) {
	    return e;
	} else if( e == NONE ) {
	    return this;
	} else {
	    final Element unionLeft = left.union( e.left );
	    final Element unionRight = right.union( e.right );
	    return new Element( unionLeft, unionRight );
	}
    }

    public String toString() {
	if ( this == NONE ) {
	    return "";
	} else {
	    final String strLeft = left.toString();
	    final String strRight = right.toString();
	    return String.format( "(%s,%s)", strLeft, strRight );
	}
    }
}

class Tokenizer {

    int index;
    final String input;

    Tokenizer( final String input ) {
	this.input = input;
    }

    boolean isEOF() {
	return input.length() <= index;
    }

    void next() {
	index++;
    }

    char token() {
	return input.charAt( index );
    }
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextLine() ) {

	    final String[] input = stdin.nextLine().split( " " );
	    final String order = input[ 0 ];
	    final Element left = parse( new Tokenizer( input[ 1 ] ) );
	    final Element right = parse( new Tokenizer( input[ 2 ] ) );

	    if ( "i".equals( order ) ) {
		System.out.println( left.intersection( right ) );
	    } else {
		System.out.println( left.union( right ) );
	    }	    
	}	
    }

    static Element parse( Tokenizer tk ) {
	if ( tk.isEOF() || tk.token() != '(' ) {
	    return Element.NONE;
	} else {
	    tk.next();  // (
	    final Element left = parse( tk );
	    tk.next();  // ,
	    final Element right = parse( tk );
	    tk.next(); // )
	    return new Element( left, right );
	}
    }    
}