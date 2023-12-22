import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        String A=alpha.toUpperCase();
        
        if (A.equals(alpha)) {
            System.out.println("A");
        }else{
            System.out.println("a");
        }
        sc.close();
    }
}