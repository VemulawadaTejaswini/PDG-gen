/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int p = sc.nextInt();
        System.out.println((a * 3 + p)/2 );

        sc.close();
    }

    /**
     * Pair_int
     */
    public static class Pair {
        public int x;
        public int y;

        /**
         * Constructor 
         * Sample Code
         * 
         *      Pair[] pair = new Pair[5];
                for (int i = 0; i < 5; i++) {
                    pair[i] = new Pair(sc.nextInt(), sc.nextInt());
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println(pair[i].x + " " + pair[i].y);
                }
         *
         */
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

    }

}



