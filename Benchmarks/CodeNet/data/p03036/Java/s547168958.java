import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int r = scan.nextInt();
        int d = scan.nextInt();
        int x = scan.nextInt();
        System.out.println(r * x - d);
        System.out.println(r * r * x - r * d - d);
        System.out.println(r * r * r * x - r * r * d - r * d - d);
        System.out.println((int)(Math.pow(r, 4) * x - r * r * r * d - r * r * d - r * d - d));
        System.out.println((int)(Math.pow(r, 5) * x - Math.pow(r, 4) * d - r * r * r * d - r * r * d - r * d - d));
        System.out.println((int)(Math.pow(r, 6) * x - Math.pow(r, 5) * d - Math.pow(r, 4) * d - r * r * r * d - r * r * d - r * d - d));
        System.out.println((int)(Math.pow(r, 7) * x - Math.pow(r, 6) * d - Math.pow(r, 5) * d - Math.pow(r, 4) * d - r * r * r * d - r * r * d - r * d - d));
        System.out.println((int)(Math.pow(r, 8) * x - Math.pow(r, 7) * d - Math.pow(r, 6) * d - Math.pow(r, 5) * d - Math.pow(r, 4) * d - r * r * r * d - r * r * d - r * d - d));
        System.out.println((int)(Math.pow(r, 9) * x - Math.pow(r, 8) * d - Math.pow(r, 7) * d - Math.pow(r, 6) * d - Math.pow(r, 5) * d - Math.pow(r, 4) * d - r * r * r * d - r * r * d - r * d - d));
        System.out.println((int)(Math.pow(r, 10) * x - Math.pow(r, 9) * d - Math.pow(r, 8) * d - Math.pow(r, 7) * d - Math.pow(r, 6) * d- Math.pow(r, 5) * d - Math.pow(r, 4) * d - r * r * r * d - r * r * d - r * d - d));
    }
}