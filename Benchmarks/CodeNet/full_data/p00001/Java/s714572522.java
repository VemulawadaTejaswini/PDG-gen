import java.io.*;
import java.util.*;
import java.lang.*;

import static java.util.Arrays.*;
import static java.util.Collections.reverseOrder;

/**
 * Created by locona on 2016/06/02.
 */
public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int i = 0;
        Integer [] mountains = new Integer[10];
        String line;
        while((line = br.readLine()) != null) {
            mountains[i++] = Integer.valueOf(line);
            if(i >= 10) break;
        }
        sort(mountains, Comparator.reverseOrder());
        for(i=0; i < 3; i++) {
            out.println(mountains[i]);
        }
        out.flush();
    }
}