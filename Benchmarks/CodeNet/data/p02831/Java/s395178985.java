

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int lcm(int a, int b){
        int m = a, n = b;   
        int t = m % n;
        while(t != 0){
            m = n;
            n = t;
            t = m % n;
        }                   
        int l = a * b / n;
        return l;
    }
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String[]z=br.readLine().split(" ");
        int a = Integer.parseInt(z[0]);
        int b = Integer.parseInt(z[1]);
        int s = lcm(a , b);
        System.out.print(s);
    }
}

