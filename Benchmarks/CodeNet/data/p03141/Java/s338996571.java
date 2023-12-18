import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s1 = new String(in.readLine());
        int n = Integer.parseInt(s1);

        String s;
        String[] sp;
        long[] dish = new long[n];
        long score = 0;
        for( int x = 0; x < n ; x++){
          s = new String(in.readLine());
          sp = s.split(" ",0);
          dish[x] = Long.parseLong(sp[0])  -   Long.parseLong(sp[1]);

            score = score + dish[x];
        }

        System.out.print( score );
  }
}