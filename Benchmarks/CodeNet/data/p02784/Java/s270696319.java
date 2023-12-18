package main;

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        String[] in2 = br.readLine().split(" ");
        int H = Integer.parseInt(in1[0]);
        int N = Integer.parseInt(in1[1]);

        br.close();
        int sum = Arrays.stream(in2)
                        .mapToInt(Integer::parseInt)
                        .sum();
        
        System.out.println(sum >= H ? "Yes" : "No");
    }
}