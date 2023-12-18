import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        AB[] abs = new AB[n];
        for (int i = 0; i < n; i++) {
            String[] sab = br.readLine().split(" ");
            int a = Integer.parseInt(sab[0]);
            int b = Integer.parseInt(sab[1]);
            AB ab = new AB();
            ab.a = a;
            ab.b = b;
            abs[i] = ab;
        }
        
        Arrays.sort(abs, new Comparator<AB>(){
            public int compare(AB ab1, AB ab2){
              return ab1.a - ab2.a;
            }
        });
        
        long cost = 0;
        int tobuy = m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < abs[i].b; j++) {
                if (tobuy > 0) {
                    cost += abs[i].a;
                    tobuy--;
                }
            }
        }
        
        System.out.println(cost);
    }
}

class AB {
    int a;
    int b;
}

