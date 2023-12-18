//package Beginner122;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int i = 0;
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('T');
        set.add('G');
        set.add('C');
        int max = Integer.MIN_VALUE;
        while(i < str.length()) {
            int j = i;
            int count = 0;
            while(j < str.length() && set.contains(str.charAt(j))) {
                j++;
                count++;
            }

            max = Math.max(max, count);
            if(count == 0) {
                i++;
            } else {
                i = j;
            }
        }
        System.out.println(max);
    }
}
