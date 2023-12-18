import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(Math.pow(a,0.5) + Math.pow(b,0.5) < Math.pow(c,0.5)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
