import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int a = input.nextInt();
        int k = input.nextInt();
        int b=t-k;
        if(b<0){
            a=a+b;
            b=0;
        }
        System.out.println(b);
        System.out.println(a);
    }
}