import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long a = scan.nextLong();
        String bs = scan.next();
        int b = Integer.parseInt(Character.toString((bs.charAt(0)))) * 100
                + Integer.parseInt(Character.toString((bs.charAt(2)))) * 10
                + Integer.parseInt(Character.toString((bs.charAt(3))));
        System.out.println((long)a * b / 100);
        scan.close();
    }
}