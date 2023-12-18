import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        if(N%500 <= A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        in.close();
    }
}
