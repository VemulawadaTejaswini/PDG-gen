import java.util.*;
 
public class Main {
	public static final int M   = 0;
	public static final int F   = 1;
	public static final int R   = 2;

	public static final int ABSENT = -1;

	public static final int POINT_A = 80;
	public static final int POINT_B = 65;
	public static final int POINT_C = 50;
	public static final int POINT_D = 30;
	public static final int R_POINT = 50;
	
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );

        while( true ) {
            int m   = scan.nextInt();
            int f   = scan.nextInt();
            int r   = scan.nextInt();
             
            if ( m == ABSENT && f == ABSENT && r == ABSENT )
                break;
			
            String result = "F";
            int sum         = m + f;
             
            if ( m == ABSENT || f == ABSENT ) {
                result = "F";
             
            } else if ( sum >= POINT_A ) {
                result = "A";
                 
            } else if ( sum >= POINT_B && sum < POINT_A ) {
                result = "B";
                 
            } else if ( sum >= POINT_C && sum < POINT_B ) {
                result = "C";
                 
            } else if ( sum >= POINT_D && sum < POINT_C ) {
                result = "D";
                 
                if ( r >= 50 )	result = "C";
                 
            } else if ( sum <= POINT_C ) {
                result = "F";
                 
            }
             
            System.out.println(result);
             
        }
         
    }
}