package atcoder;

import java.util.Scanner;

/**
 * Created by Abhilash on 28-01-2017.
 */
public class ABC_ARC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<1200)
            System.out.println("ABC");
        else
            System.out.println("ARC");
    }
}
