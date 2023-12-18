import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int b = n%500;
        if (b<=a)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
