
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        
        String c11 = String.valueOf(c1.charAt(0));
        String c12 = String.valueOf(c1.charAt(1));
        String c13 = String.valueOf(c1.charAt(2));
        String c21 = String.valueOf(c2.charAt(0));
        String c22 = String.valueOf(c2.charAt(1));
        String c23 = String.valueOf(c2.charAt(2));
        
        if (c11.equals(c23) && c12.equals(c22) && c13.equals(c21)) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }          
    
    }
}