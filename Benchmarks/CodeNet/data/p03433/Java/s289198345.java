// package whatever; // don't place package name!


import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws Exception {
        int N = 0;
        int A = 0;
        int divNum = 500;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();

        if ( N % divNum <= A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }            
    }

}
