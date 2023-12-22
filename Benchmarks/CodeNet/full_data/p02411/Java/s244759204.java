import java.util.*;

public class Main {
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
        ArrayList<int[]> studentRecord = new ArrayList<>();
        
        int M   = 0;
        int F   = 1;
        int R   = 2;
        
        int ABSENT = -1;
        
        int POINT_A = 80;
        int POINT_B = 65;
        int POINT_C = 50;
        int POINT_D = 30;
        int R_POINT = 50;
        
        while( true ) {
            int m   = scan.nextInt();
            int f   = scan.nextInt();
            int r   = scan.nextInt();
            
            if ( m == ABSENT && f == ABSENT && r == ABSENT )
                break;
            
            int[] record = new int[3];
            record[M] = m;
            record[F] = f;
            record[R] = r;
            
            studentRecord.add(record);
        
        }
        
        for( int i = 0; i < studentRecord.size(); i++ ) {
            String result = "F";
            
            int[] record    = studentRecord.get(i);
            int sum         = record[M] + record[F];
            
            if ( record[M] == ABSENT || record[F] == ABSENT ) {
                result = "F";
            
            } else if ( sum >= POINT_A ) {
                result = "A";
                
            } else if ( sum >= POINT_B && sum < POINT_A ) {
                result = "B";
                
            } else if ( sum >= POINT_C && sum < POINT_B ) {
                result = "C";
                
            } else if ( sum >= POINT_D && sum < POINT_C ) {
                result = "D";
                
                if ( record[R] >= 50 ) {
                    result = "C";
                    
                }
                
            } else if ( sum <= POINT_C ) {
                result = "F";
                
            }
            
            System.out.println(result);
            
            
        }
        
    }
}