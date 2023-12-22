import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double total = Math.pow(a, 2) + Math.pow(a, 3) + a;
        System.out.println((int)(total));
    }
}
