import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {

    public static int gcd(int a, int b){
        if(a % b == 0)return b;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();

        System.out.println(gcd(x, y));

    }
  
}
