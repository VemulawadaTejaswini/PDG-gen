import java.lang.String;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        x-= a;
        x-=(x/b)*b;
        System.out.println(x);


    }

}