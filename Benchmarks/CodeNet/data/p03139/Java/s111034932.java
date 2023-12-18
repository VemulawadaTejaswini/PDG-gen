package AtCoder.Nekkei;

import java.io.*;
import java.util.*;

public class NA {
    
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int[] arr = s.nextIntArray(n);

        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(Math.min(a,b) + " " + Math.max(0,(a+b-n)));

//        if (!oj) {
//            System.out.println(Arrays.deepToString(new Object[]{System.currentTimeMillis() - time + " ms"}));
//        }
        //out.flush();
    }

}