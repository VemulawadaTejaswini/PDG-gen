import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s1 = new String(in.readLine());
        String s2 = new String(in.readLine());
        String s3 = new String(in.readLine());
        String s4 = new String(in.readLine());

        int n = Integer.parseInt(s1);

        int score = 0;
        char c2,c3,c4;
        for( int x = 0; x < n ; x++){
            c2 = s2.charAt(x);
            c3 = s3.charAt(x);
            c4 = s4.charAt(x);

            if( c2 != c3 ){
                if( c2 != c4){
                    score = score + 2;
                }else{
                    score = score + 1;
                }
            }else{
                if( c2 != c4){
                    score = score + 1;
                }
            }
        }
        System.out.print( score );
  }
}