import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (Algo.isOdd(n) && n >= 3){
            System.out.println("Yes");
            System.out.println("1 2");
            System.out.println("2 3");
            System.out.println("3 "+ (n+1));
            System.out.println((n+1) + " " + (n+2));
            System.out.println((n+2) + " " + (n+3));
            // back born
            for (int i = 4; i <= n; i++) {
                System.out.println(1 + " " + i);
                if (Algo.isOdd(i)) {
                    System.out.println(i + " " + (i+n-1));
                }else {
                    System.out.println(i + " " + (i+n+1));
                }
            }
        }else {
            System.out.println("No");
        }


        sc.close();
    }
}

class Algo{
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }
}


