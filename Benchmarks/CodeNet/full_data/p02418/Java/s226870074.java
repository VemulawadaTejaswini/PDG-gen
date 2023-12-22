import java.util.*;				
				
class Main {				
    public static void main(String[] args) {				
        Scanner sc=new Scanner(System.in);				
            String s = sc.nextLine();				
            String p = sc.nextLine();				
				
            int slen = s.length();				
            int plen = p.length();				
            int j = 0,i;				
            for( i = 0; i<slen; i++ ) {				
                if( p.charAt( 0 ) == s.charAt( i ) ) {				
                    int k = i;				
                    for( j = 0; j<plen; j++ ) {				
                        k = ( i+j ) % slen;				
                        if( p.charAt( j ) != s.charAt( k ) ) break;				
                    }				
                }				
                if( plen == j ) break;				
            }				
				
            if( plen == j ) {				
                System.out.println( "Yes" );            				
            } else {				
                System.out.println( "No" );				
            }				
    }				
}				
				
