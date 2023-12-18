import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Match{
    public static int simple(String str, char target){
	    int count = 0;
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
        int num;
        int ans = 0;
        int r_num = 0;
        int g_num = 0;
        int b_num = 0;
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

            for(int i = 0; i <= num - 3 ; i++ ){
                for(int j = i+1; j <= (num-1) / 2 + i  ; j++ ){
                    int k = 2 * j - i;
                    String tmp;
                    
                    tmp = String.valueOf( buf.charAt(i) ) + String.valueOf( buf.charAt(j) ) + String.valueOf( buf.charAt(k) );
                    if ( tmp.contains("R") == true && tmp.contains("G") == true && tmp.contains("B") == true ){
                        ans -= 1;
                    }
                }
            }  
            
            System.out.println(Integer.toString(ans));
            
        } catch(Exception e) {}
    }
}