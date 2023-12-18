import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int t = b - a;
        int tt = (t + 1) * t / 2;


        System.out.println(tt - b);





    }
}