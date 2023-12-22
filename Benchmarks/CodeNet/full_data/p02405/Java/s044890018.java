import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner( System.in);   
         
        while( true ) {
            int H = kb.nextInt();
            int W = kb.nextInt();
             
            if( 0==W && 0==H ) { break; }
             
            for( int i=0; i<H; i++ ) {
                for( int j=0; j<W; j++ ) {
                    if((j+i)%2==0) {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.print( "\n" );
            }
            System.out.print( "\n" );
        }
    }
}