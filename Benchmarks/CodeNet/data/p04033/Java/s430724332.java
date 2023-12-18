import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > 0){
            System.out.println("Positive");
        }else if(a <= 0 && b >= 0){
            System.out.println("Zero");
        }else{
            int c = Math.abs(a-b);
            if(c % 2 != 0){
                System.out.println("Positive");
            }else{
                System.out.println("Negative");
            }
        }
    }
}
