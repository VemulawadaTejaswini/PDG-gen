import java.util.*;
import java.io.*;

public class Main {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());

        int[] height = new int[n];

        for(int i = 0; i < n; i++) height[i] = Integer.parseInt(s.next());

        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(Math.abs(j - i) == Math.abs(height[j]+height[i])) count++;
            }
        }

 
        System.out.println(count);
    }
}