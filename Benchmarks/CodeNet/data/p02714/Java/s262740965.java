import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Match{
    public static long simple(String str, char target){
	    long count = 0;
	    for(char x: str.toCharArray()){
		    if(x == target){
			count++;
		    }
	    }
	    return count;
    }
}

class Main{
    public static void main(String args[]){
        String buf;
        long num;
        long ans = 0;
        long r_num = 0;
        long g_num = 0;
        long b_num = 0;
        char r = 'R';
        char g = 'G';
        char b = 'B';

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt( br.readLine() );
            buf = br.readLine();
            r_num = Match.simple( buf , r );
            g_num = Match.simple( buf , g );
            b_num = Match.simple( buf , b );
            ans = r_num * g_num * b_num;

            for(int i = 0; i < num ; i++ ){
                for(int j = i + 1; j <= (num+i) / 2 + 2  ; j++ ){
                    int k = 2 * j - i;
                    if (k < num){
                        String tmp;
                        tmp = String.valueOf( buf.charAt(i) ) + String.valueOf( buf.charAt(j) ) + String.valueOf( buf.charAt(k) );
                        if ( tmp.contains("R") && tmp.contains("G") && tmp.contains("B") ){
                            ans = ans - 1;
                        }
                    }
                }
            }  
            
            
            
        } catch(Exception e) {
        }
        System.out.println(Long.toString(ans));
    }
}
