package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class X_Cubic {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String str = new String(in.readLine());
        
        int a = Integer.parseInt(str);
        
        System.out.println(Math.pow(a, 3));
        
    }
}