import java.util.Scanner;

public class Balls {
    public static void main( String args[] ){
        Scanner keyboard = new Scanner( System.in );
        int r = keyboard.nextInt();
        int g = keyboard.nextInt();
        int b = keyboard.nextInt();
        int total = keyboard.nextInt();
        
        int numSols = 0;
        
        for( int x = 0; x < 3000; x++ ){
            for( int y = 0; y < 3000; y++ ){
                for( int z = 0; z < 3000; z++ ){
                    if( r*x + g*y + b*z == total ){
                        numSols++;
                    }
                }
            }
        }
        
        System.out.println( numSols );
    }
}