/*AOJ-ITP-4-1*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[] = br.readLine().split(" ");
        int count = 0;
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        
        if(!(a >= 1 && b >= 1 && a <= 10e9 && b <= 10e9)){System.exit(1);}
        
        int d = a / b;
        int r = a % b;
        double f = (a / b);
        
        System.out.println(d + " " + r + " " + f);
    }
}