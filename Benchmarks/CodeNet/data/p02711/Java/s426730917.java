import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0) == '7' || s.charAt(1) == '7' || s.charAt(2) == '7'){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }

}