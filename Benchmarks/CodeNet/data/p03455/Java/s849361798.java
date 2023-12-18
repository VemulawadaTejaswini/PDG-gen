import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a%2==1 && b%2==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

        in.close();
    }
}
