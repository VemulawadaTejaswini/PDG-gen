import java.io.*;
import java.util.*;
  
public class Main{
    public static void main(String[] args)throws IOException, NumberFormatException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        ArrayList<Integer> h = new ArrayList<Integer>();
        ArrayList<Integer> w = new ArrayList<Integer>();
          
        while(true){
            String[] s = br.readLine().split(" ");
            if( "0".equals(s[0]) && "0".equals(s[1]) ) break;
              
            h.add( Integer.parseInt(s[0]) );
            w.add( Integer.parseInt(s[1]) );
        }
          
        StringBuilder builder = new StringBuilder();
        for( int i=0 ; i<h.size() ; i++ ){
            for( int j=0 ; j<h.get(i) ; j++ ){
                for( int k=0 ; k<w.get(i) ; k++ ){
                    builder.append("#");
                }
                builder.append("\n");
            }
            builder.append("\n");
        }
        System.out.print(builder);
    }
}