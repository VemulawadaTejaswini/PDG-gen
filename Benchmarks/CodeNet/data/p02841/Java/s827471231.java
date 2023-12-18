import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int m1 = scan.nextInt();
        int d1 = scan.nextInt();
        int m2 = scan.nextInt();
        int d2 = scan.nextInt();
        System.out.println(m1 == m2 ? 0 : 1);
        scan.close();
    }
}