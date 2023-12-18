import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int a = input.nextInt();
        int k = input.nextInt();
        int b=t-k;
        int c=a+b;
        if(b<0){
            b=0;
        }
        System.out.println(b);
        System.out.println(c);
    }
}