
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String check = "#";
        String period = ".";
        
        while(true) {
            String line = reader.readLine();
            String[] columns = line.split(" ");
            int y = Integer.parseInt(columns[0]);
            int x = Integer.parseInt(columns[1]);
            
            if (x == 0 && y == 0 ) 
                break;
            for ( int j = 0 ; j < y ; j++) {
                if (j % 2 == 0 )
                    builder.append(DrawChessBoard(check,period,x));
                else
                    builder.append(DrawChessBoard(period,check,x));
            }
            builder.append("\n");
        }
        System.out.print(builder);
    }
    public static StringBuilder DrawChessBoard(String check,String period,int x) {
        StringBuilder str = new StringBuilder();
        for ( int i = 0 ; i < x ; i++) {
                if (i % 2 == 0 ) 
                    str.append(check);
                else
                    str.append(period);
            }
            str.append("\n");
            return str;
    }
}