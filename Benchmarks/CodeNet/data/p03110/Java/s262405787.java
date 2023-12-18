import java.util.*;
import java.io.*;

public class Main {
    static double BTCRate = 380000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double total = 0;
        for(int n=0; n<N; n++){
            double x = sc.nextDouble();
            String u = sc.next();
            if(u.equals("JPY")) total += x;
            else if(u.equals("BTC")) total += x*BTCRate;
        }
        System.out.println(total);


    }
}