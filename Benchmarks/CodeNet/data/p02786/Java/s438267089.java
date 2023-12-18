import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long h = scan.nextLong();
        long out = 1;
        while(h > 1){
            h = h / 2;
            out *= 2;
            out++;
        }
        System.out.println(out);
        scan.close();
    }
}