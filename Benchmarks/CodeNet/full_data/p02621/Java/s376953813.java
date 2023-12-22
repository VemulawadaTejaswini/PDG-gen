import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (int)Math.pow(a,2);
        int c = (int)Math.pow(a,3);
        System.out.println(a+b+c);
    }
}
