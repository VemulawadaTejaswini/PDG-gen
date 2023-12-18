import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a+b+(2*Math.pow(a*b,0.5)) < c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
