//Created by Aminul on 8/2/2020.

import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        char[] str = in.next().toCharArray();
        TreeSet<Integer> red = new TreeSet<>(), white = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if(str[i] == 'R') red.add(i);
            else white.add(i);
        }

        int cnt = 0;
        while (!white.isEmpty() && !red.isEmpty() && white.first() < red.last()) {
            int r = red.pollLast(), w = white.pollFirst();
            red.add(w);
            white.add(r);
            cnt++;
        }

        pw.println(cnt);
          
        pw.close();
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}