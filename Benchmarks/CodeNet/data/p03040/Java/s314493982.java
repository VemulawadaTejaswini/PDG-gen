/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;
import java.awt.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int                 n           = sc.nextInt();
        PriorityQueue<Long> pribig      = new PriorityQueue<>(Comparator.naturalOrder());
        PriorityQueue<Long> prismall    = new PriorityQueue<>(Comparator.reverseOrder());
        long                sum_big     = 0;
        long                sum_small   = 0;
        long                sum_b       = 0;
        long                median;

        for (int i = 0; i < n; i++) {
            /**
             * n - Queries
             */
            int query_type = sc.nextInt();
            if (query_type == 1) {
                // koushin
                long a_query    = sc.nextLong();
                long b_query    = sc.nextLong();
                sum_b           += b_query;

                if (prismall.isEmpty() || prismall.peek() >= a_query) {
                    // prismall.peek -> pribig, a -> prismall
                    prismall.add(a_query);
                    sum_small   +=  a_query;
                    if (!prismall.isEmpty() && prismall.size() > pribig.size() + 1 ) {
                        long change = prismall.poll();
                        sum_small   -= change;
                        sum_big     += change;
                        pribig.add(change);
                    }
                }else{
                    pribig.add(a_query);
                    sum_big += a_query;
                    if (pribig.size() > prismall.size()) {
                        long odsends    = pribig.poll();
                        sum_big         -= odsends;
                        sum_small       += odsends;
                        prismall.add(odsends);
                    }
                }
            }else if(query_type == 2){
                // hanbetsu
                // small = big or small = big + 1
                median = prismall.peek();
                System.out.println(median + " " + 
                                    (sum_big - sum_small + sum_b +(prismall.size() - pribig.size()) * median));
            }
            
        }

        sc.close();
    }

}


