import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int paid = n*800;
        int back = (n/15)*200;

        System.out.println(paid-back);
    }
}
