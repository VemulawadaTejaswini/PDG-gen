import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        double ans=(a+b)/2.0;
        System.out.println(Math.round(ans));
    }
}