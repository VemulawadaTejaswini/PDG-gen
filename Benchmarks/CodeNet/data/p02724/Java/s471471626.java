import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int a = x%500;

        System.out.println((1000*(x/500))+((a/5)*5));
    }
}