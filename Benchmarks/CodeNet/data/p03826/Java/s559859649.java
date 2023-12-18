import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int fi = a*b;
        int se = c*d;
        if (fi>se)
            System.out.println(fi);
        else
            System.out.println(se);
    }
}
