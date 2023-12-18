import java.util.* ;
public class Main{
       public static void main( String args[] ){
             Scanner cin = new Scanner( System.in ) ;
             int n = cin.nextInt() ;
             int x = cin.nextInt() ;
             int a[] = new int[100010] ;
             for( int i = 1 ; i <= n ; i++ )
                 a[i] = cin.nextInt() ;
             int ans = abs( a[1] - x ) ;
             for( int i = 2 ; i <= n ; i++ )
                 ans = gcd( ans , abs( a[1] - a[i] ) ) ;
             System.out.println( ans ) ;
       }
       public static int abs( int x ){
             return x >= 0 ? x : -x ;
       }
       public static int gcd( int a , int b ){
             return b == 0 ? a : gcd( b , a % b ) ;
       }
} 