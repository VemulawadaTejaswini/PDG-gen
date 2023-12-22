import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
            int n, x, count, tmp3, tmp2;
            String[] tmpArray;  
            while( true ) {
                String str = scan.nextLine();
                tmpArray = str.split( " " );
                n = Integer.parseInt( tmpArray[0] );
                x = Integer.parseInt( tmpArray[1] );

                if( 0 == n && 0 == x ) {  break; }

                count = 0;
                tmp3 = x / 3;
                int i, j, k;
                for( i=1; i<tmp3; i++ ) {
                    tmp2 = ( x-i ) / 2;
                    for( j=i+1; j<=tmp2; j++ ) {
                        k = x - i - j;
                        if( j < k && k <= n ) {
                            count++;
                        }
                    }
                }
                System.out.println( count );    
            }
        } 
}
