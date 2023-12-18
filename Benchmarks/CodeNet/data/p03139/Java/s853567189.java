import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        String[] s2 = s.split(" ",0);
        int n = Integer.parseInt(s2[0]);
        int a = Integer.parseInt(s2[1]);
        int b = Integer.parseInt(s2[2]);

        int c;
        if(a > b){
            c=b;
        }else{
            c=a;
        }

        int d;
        d = a+b-n;
        if(d < 0){
            d = 0;
        }
        System.out.print( c + " " + d );
  }
}