import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();
        int b = a1 + a2 + a3;
        if(b >= 22){
            System.out.println("bust");
        }else{
            System.out.println("win");
        }
    }
}