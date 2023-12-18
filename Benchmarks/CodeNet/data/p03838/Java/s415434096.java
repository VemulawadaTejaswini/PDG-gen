/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        int start = sc.nextInt();
        // get two integers separated with half-width break
        int end = sc.nextInt();
        
        int base = 0;

         //special case where the start and end are the same.
        if (start == end) {
            System.out.println(0);
            return;
        }
        
        //special case where the sign is different.
        if (start == -1 * end) {
            System.out.println(1);
            return;
        }
        
        
        base = Math.abs(Math.abs(start) - Math.abs(end));
        
        if (start >= 0)
        {
            if (end >= 0)
            {
                if (start > end)
                {
                    //e.g 7 -> 5   7 -> -7 -> -5 -> 5
                    base = base + 2;
                }
                else
                {
                    //e.g. 5 -> 7
                    base = base;
                }
                
            }
            else
            {
                //start is above 0, end is less than 0
                 if (Math.abs(start) > Math.abs(end))
                {
                    //e.g 5 -> -2   5 -> -5 ->  -2
                    base = base + 1;
                }
                else
                {
                    //e.g. 5 -> -7  5 -> 7 -> -7
                    base = base +1;
                }
            }
            
        }
        else //start less than 0
        {
            if (end > 0)
            {
                if (Math.abs(start) > Math.abs(end))
                {
                    //e.g -7 -> 5   -7 -> -5 -> 5
                    base = base + 1;
                }
                else
                {
                    //e.g. -7 -> 9   -7 -> +7 -> 9
                    base = base + 1;
                }
            }
            else
            {
                if (Math.abs(start) > Math.abs(end))
                {
                    //e.g -7 -> -5   
                    base = base;
                }
                else
                {
                    //e.g. -7 -> -9  
                    base = base + 2;
                }
            }
        }

        // outputxx
        System.out.println(base);
    }
}
