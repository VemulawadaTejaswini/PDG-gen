import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==0){
            System.out.println('0');
            System.exit(0);
        }else if(n==a+b){
            System.out.println(a);
            System.exit(0);
        }else{
            int ns=n-(a+b);
            System.out.print(ns+a);
        }
    }
}