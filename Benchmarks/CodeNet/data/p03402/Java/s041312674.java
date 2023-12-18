import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        char grid[][] = new char[100][100];
        for(int i = 0 ; i < 100; i++ ) {
            for(int j = 0; j < 100; j++ ) {
                if( i < 50 ) {
                    grid[i][j] = '.';
                } else {
                    grid[i][j] = '#';
                }
            }
        }
        
        A--;
        B--;
        
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if( A > 0 ) {
                    if( 50 <= i && i % 2 == 1 && j % 2 == 1 ) {
                        A--;
                        grid[i][j] = '.';
                    }
                }
                
                if( B > 0 ) {
                    if( i < 50 && i % 2 == 1 && j % 2 == 1 ) {
                        B--;
                        grid[i][j] = '#';
                    }
                }
            }
        }
        
        System.out.println( 100 + " " + 100 );
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++ ) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
