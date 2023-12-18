import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int K = 0;

        if(A == 0 || B == 0){
            System.out.println("IMPOSSIBLE");
        }
        else{
            K = (A+B)/2;
            if(A+B%2 == 0){
                System.out.println(K);
            }else{
                System.out.println("IMPOSSIBLE");
            }
        }

    }
}