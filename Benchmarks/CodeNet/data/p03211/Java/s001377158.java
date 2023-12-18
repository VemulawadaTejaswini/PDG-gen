import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int min = 1000;
        
        for (int i = 0; i+2 < line.length(); i++) {
            String s = line.substring(i, i+3);
            if (min > Math.abs(753-Integer.parseInt(s))) {
                min = Math.abs(753-Integer.parseInt(s));
            }
        }
        
        System.out.println(min);
    }
}
